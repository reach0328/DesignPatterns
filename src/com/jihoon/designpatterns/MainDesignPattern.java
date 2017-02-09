package com.jihoon.designpatterns;

import com.jihoon.designpatterns.proxy.Bbs;
import com.jihoon.designpatterns.proxy.Proxy;
import com.jihoon.designpatterns.singleton.Multiton;
import com.jihoon.designpatterns.singleton.Singleton;
import com.jihoon.designpatterns.templatemethod.Frog;
import com.jihoon.designpatterns.templatemethod.Rabbit;
import com.jihoon.designpatterns.templatemethod.TemplateMethod;

public class MainDesignPattern {

	public static void main(String[] args) {

		//1. singleton pattern
		//�ν��Ͻ� ������ �����ϱ����� �����ڸ� private
		//Singleton single2 = new Singleton();
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.printf("single1.name=%s single2.name =%s \n",single1.name,single2.name);
		single1.name = "ȫ�浿";
		System.out.printf("single1.name=%s single2.name =%s \n",single1.name,single2.name);
		
		//2. Multiton pattern
		Multiton multi1 = Multiton.newInstance();
		Multiton multi2 = Multiton.newInstance();
		System.out.printf("multi1.name=%s multi2.name =%s \n",multi1.name,multi2.name);
		multi1.name = "ȫ�浿";
		System.out.printf("multi1.name=%s multi2.name =%s \n",multi1.name,multi2.name);
		
		//2-1 . �̱��Ͽ� new Instance �Լ��� �߰��ϰ� ���� single3�� �������� single3.name�� ����غ�����
		Singleton single3 = Singleton.newInstance();
		System.out.printf("single3.name=%s \n",single3.name);
	
		
		// 3. Proxy Patterns
		Proxy proxy = Proxy.getInstance();
		Bbs bbs = proxy.getBbs(33);
		System.out.printf("Bbs.no =%d, Bbs.Title = %s Bbs.content = %s \n", bbs.no,bbs.title,bbs.content);		
		
		
		
		
		//4. template Method patterns
		TemplateMethod frog = new Frog();
		frog.play();
		TemplateMethod rabbit = new Rabbit();
		rabbit.play();
		
	}
}