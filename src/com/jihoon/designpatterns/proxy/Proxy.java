package com.jihoon.designpatterns.proxy;

/*
 * Proxy
 * 대행자로써
 * 중간에 다른 기능 또는 요구사항을 처리한 후
 *  클라이언트 요청에 대한 원본데이터는 변형하지 않고 그대로 전달한다.
 * 자료를 대행하여 가져오면서  부가적인 일을 해주지만 원본 데이터는 변경하지 않는다 패턴
 */

public class Proxy {
		
	//싱글턴을 자신을 담아두는 변수 공간
	public static Proxy instance = null;
	
	//인스턴스 생성을 방지하기위해 생성자를 private
	private Proxy() {
		
	}
	
	public static Proxy getInstance() {	
		//1. instance 변수 값이 있는지를 체크한다.
		// 생성자가 private이지만 동일class안에 있기 때문에 new를 할 수 있다.	
		if(instance == null){
			instance = new Proxy();
		}
		//2. instance를 리턴한다.
		return instance;
	}	
	public Bbs getBbs(int bbsno) {
		Bbs bbs = Database.readBbs(bbsno); // 실제로는 데이터베이스를 통해 가져온다는 가정.
		
		// 원형 데이터는 변형하지 않아야 proxy이다!!!
		// 추가적인 정보들을 변경 해서 추가하여 넣는 경우만 존재
		
		Visit visit = new Visit();
		visit.increase(bbsno);
		
		return bbs;
	}
}
