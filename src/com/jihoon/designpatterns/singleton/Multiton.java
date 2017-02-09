package com.jihoon.designpatterns.singleton;

/*
 * Multiton
 * 싱글턴과 반대되는 개념이지만 new라는 의존성(dependency)을 제거해준다는 장점 이있다.
 */
public class Multiton {

	//생성자 막기
	private Multiton() { }
	
	// 생성 함수를 제공 한다.
	public static Multiton newInstance() {
		return new Multiton();
	}
	
	public String name = "";
}
