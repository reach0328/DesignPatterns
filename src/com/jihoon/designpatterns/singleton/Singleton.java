package com.jihoon.designpatterns.singleton;

public class Singleton {
	
	//�̱����� �ڽ��� ��Ƶδ� ���� ����
	public static Singleton instance = null;
	
	//�ν��Ͻ� ������ �����ϱ����� �����ڸ� private
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {	
		//1. instance ���� ���� �ִ����� üũ�Ѵ�.
		// �����ڰ� private������ ����class�ȿ� �ֱ� ������ new�� �� �� �ִ�.	
		if(instance == null){
			instance = new Singleton();
		}
		//2. instance�� �����Ѵ�.
		return instance;
	}	
	
	public String name = "";

	public static Singleton newInstance() {
		return new Singleton();
	}
}
