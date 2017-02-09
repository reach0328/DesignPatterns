package com.jihoon.designpatterns.singleton;

public class Singleton {
	
	//싱글턴을 자신을 담아두는 변수 공간
	public static Singleton instance = null;
	
	//인스턴스 생성을 방지하기위해 생성자를 private
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {	
		//1. instance 변수 값이 있는지를 체크한다.
		// 생성자가 private이지만 동일class안에 있기 때문에 new를 할 수 있다.	
		if(instance == null){
			instance = new Singleton();
		}
		//2. instance를 리턴한다.
		return instance;
	}	
	
	public String name = "";

	public static Singleton newInstance() {
		return new Singleton();
	}
}
