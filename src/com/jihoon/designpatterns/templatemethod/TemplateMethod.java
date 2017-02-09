package com.jihoon.designpatterns.templatemethod;


/*
 * Template Method
 * 부모 클래스인 템플릿 Method에 있는 구현함수가
 * 추상함수를 상속받은 자식 클래스가 구현한 Method를 호출하는 패펀
 */

public abstract class TemplateMethod {
	// jump라는 method를 구현한 것에 따라 다르게 실행
	public void play() {
		System.out.println("play함수");
		jump();
	}
	
	public abstract void jump();
}
