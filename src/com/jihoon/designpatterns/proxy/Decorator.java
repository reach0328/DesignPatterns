package com.jihoon.designpatterns.proxy;

public class Decorator {

	//�̱����� �ڽ��� ��Ƶδ� ���� ����
	public static Decorator instance = null;
	
	//�ν��Ͻ� ������ �����ϱ����� �����ڸ� private
	private Decorator() {
		
	}
	
	public static Decorator getInstance() {	
		//1. instance ���� ���� �ִ����� üũ�Ѵ�.
		// �����ڰ� private������ ����class�ȿ� �ֱ� ������ new�� �� �� �ִ�.	
		if(instance == null){
			instance = new Decorator();
		}
		//2. instance�� �����Ѵ�.
		return instance;
	}	
	
	public BbsExtend getBbs(int bbsno) {
		// ���� �����͸� �����ͼ� �������� ����;
		BbsExtend bbs = Database.readBbsExtend(bbsno); // �����δ� �����ͺ��̽��� ���� �����´ٴ� ����.
		bbs.count = bbs.count +1;
		bbs.title = "���� : " + bbs.title;
		return bbs;
	}

}
