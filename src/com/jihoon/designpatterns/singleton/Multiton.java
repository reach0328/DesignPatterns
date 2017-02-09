package com.jihoon.designpatterns.singleton;

/*
 * Multiton
 * �̱��ϰ� �ݴ�Ǵ� ���������� new��� ������(dependency)�� �������شٴ� ���� ���ִ�.
 */
public class Multiton {

	//������ ����
	private Multiton() { }
	
	// ���� �Լ��� ���� �Ѵ�.
	public static Multiton newInstance() {
		return new Multiton();
	}
	
	public String name = "";
}
