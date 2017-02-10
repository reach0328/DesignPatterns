package com.jihoon.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * �������� �����ϴ� ���� ����
 */
public class KakaoTalkServer {
	//���������� ���� �صδ� ����Ұ� �ʿ��ϴ�
	List<Observer> observers = new ArrayList<>();
	
	// ������ �����
	public String data = "";
	
	
	// ������ ����� �������� �����ϴ� ����
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	//��������� �߻������� �������鿡�� �����ϴ� ����
	private void notification() {
		for(Observer observer : observers) {
			observer.update();
		}
	}
	
	//������ ����ϴ� �޽��� ���� �Լ�
	public void sendMessage(String msg) {
		
		data = msg;
		// �����ؾ� �Ǵ� �޽����� �߻��ϸ� notification���� ��� ���������� �˸���.
		notification();
	}
}
