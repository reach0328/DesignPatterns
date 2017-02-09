package com.jihoon.designpatterns.proxy;

public class Decorator {

	//싱글턴을 자신을 담아두는 변수 공간
	public static Decorator instance = null;
	
	//인스턴스 생성을 방지하기위해 생성자를 private
	private Decorator() {
		
	}
	
	public static Decorator getInstance() {	
		//1. instance 변수 값이 있는지를 체크한다.
		// 생성자가 private이지만 동일class안에 있기 때문에 new를 할 수 있다.	
		if(instance == null){
			instance = new Decorator();
		}
		//2. instance를 리턴한다.
		return instance;
	}	
	
	public BbsExtend getBbs(int bbsno) {
		// 원본 데이터를 가져와서 수정한후 리턴;
		BbsExtend bbs = Database.readBbsExtend(bbsno); // 실제로는 데이터베이스를 통해 가져온다는 가정.
		bbs.count = bbs.count +1;
		bbs.title = "제목 : " + bbs.title;
		return bbs;
	}

}
