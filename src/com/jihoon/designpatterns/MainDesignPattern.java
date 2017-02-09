package com.jihoon.designpatterns;

import com.jihoon.designpatterns.singleton.Multiton;
import com.jihoon.designpatterns.singleton.Singleton;

public class MainDesignPattern {

	public static void main(String[] args) {

		//1. singleton pattern
		//인스턴스 생성을 방지하기위해 생성자를 private
		//Singleton single2 = new Singleton();
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.printf("single1.name=%s single2.name =%s \n",single1.name,single2.name);
		single1.name = "홍길동";
		System.out.printf("single1.name=%s single2.name =%s \n",single1.name,single2.name);
		
		//2. Multiton pattern
		
		Multiton multi1 = Multiton.newInstance();
		Multiton multi2 = Multiton.newInstance();
		System.out.printf("multi1.name=%s multi2.name =%s \n",multi1.name,multi2.name);
		multi1.name = "홍길동";
		System.out.printf("multi1.name=%s multi2.name =%s \n",multi1.name,multi2.name);
		
		//3. 싱글턴에 new Instance 함수를 추가하고 변수 single3에 적용한후 single3.name을 출력해보세요
		Singleton single3 = Singleton.newInstance();
		System.out.printf("single3.name=%s",single3.name);
		
	}
}
