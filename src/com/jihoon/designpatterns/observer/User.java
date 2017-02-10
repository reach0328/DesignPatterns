package com.jihoon.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {

	// message�� �����ϴ� ����Ұ� �ʿ��ϴ�
	List<String> messages = new ArrayList<>();
	KakaoTalkServer server;
	String name = "";
	public User(KakaoTalkServer server,String name) {
		this.server = server;
		this.name = name;
		server.addObserver(this);
	}
	
	@Override
	public void update(String msg) {
		messages.add(msg);
		showMessage();
	}
	// Ÿ������ ���� �ԷµǴ� �޽���
	public void addMessage(String msg) {
		server.sendMessage(msg);
	}
	
	public void showMessage() {
		System.out.println(name+"���� �� �޽���:"+ messages.get(messages.size()-1));
	}

}
