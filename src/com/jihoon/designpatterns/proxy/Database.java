package com.jihoon.designpatterns.proxy;

public class Database {
	public static Bbs readBbs(int bbsno) {
		Bbs bbs = new Bbs();
		
		// ������ ����
		bbs.no = bbsno;
		bbs.title ="������";
		bbs.content = "�����Դϴ�";
		
		// ������ ������ ����
		return bbs;
	}
	
	public static void increase(int bbsno) {
		//Visit �����ʹ� ���� bbs�� ������ �����Ѵ�.
	}
	public static BbsExtend readBbsExtend(int bbsno) {
		BbsExtend bbs = new BbsExtend();
		
		// ������ ����
		bbs.no = bbsno;
		bbs.title ="������";
		bbs.content = "�����Դϴ�";
		bbs.count = 3;
		// ������ ������ ����
		return bbs;
	}
}
