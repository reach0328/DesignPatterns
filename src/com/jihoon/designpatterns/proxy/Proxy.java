package com.jihoon.designpatterns.proxy;

/*
 * Proxy
 * �����ڷν�
 * �߰��� �ٸ� ��� �Ǵ� �䱸������ ó���� ��
 *  Ŭ���̾�Ʈ ��û�� ���� ���������ʹ� �������� �ʰ� �״�� �����Ѵ�.
 * �ڷḦ �����Ͽ� �������鼭  �ΰ����� ���� �������� ���� �����ʹ� �������� �ʴ´� ����
 */

public class Proxy {
		
	//�̱����� �ڽ��� ��Ƶδ� ���� ����
	public static Proxy instance = null;
	
	//�ν��Ͻ� ������ �����ϱ����� �����ڸ� private
	private Proxy() {
		
	}
	
	public static Proxy getInstance() {	
		//1. instance ���� ���� �ִ����� üũ�Ѵ�.
		// �����ڰ� private������ ����class�ȿ� �ֱ� ������ new�� �� �� �ִ�.	
		if(instance == null){
			instance = new Proxy();
		}
		//2. instance�� �����Ѵ�.
		return instance;
	}	
	public Bbs getBbs(int bbsno) {
		Bbs bbs = Database.readBbs(bbsno); // �����δ� �����ͺ��̽��� ���� �����´ٴ� ����.
		
		// ���� �����ʹ� �������� �ʾƾ� proxy�̴�!!!
		// �߰����� �������� ���� �ؼ� �߰��Ͽ� �ִ� ��츸 ����
		
		Visit visit = new Visit();
		visit.increase(bbsno);
		
		return bbs;
	}
}
