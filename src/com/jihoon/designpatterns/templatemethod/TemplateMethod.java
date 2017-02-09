package com.jihoon.designpatterns.templatemethod;


/*
 * Template Method
 * �θ� Ŭ������ ���ø� Method�� �ִ� �����Լ���
 * �߻��Լ��� ��ӹ��� �ڽ� Ŭ������ ������ Method�� ȣ���ϴ� ����
 */

public abstract class TemplateMethod {
	// jump��� method�� ������ �Ϳ� ���� �ٸ��� ����
	public void play() {
		System.out.println("play�Լ�");
		jump();
	}
	
	public abstract void jump();
}
