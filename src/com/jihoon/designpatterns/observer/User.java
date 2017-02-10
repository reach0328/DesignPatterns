package com.jihoon.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {

	// message를 보관하는 저장소가 필요하다
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
	// 타이핑을 통해 입력되는 메시지
	public void addMessage(String msg) {
		server.sendMessage(msg);
	}
	
	public void showMessage() {
		System.out.println(name+"에게 온 메시지:"+ messages.get(messages.size()-1));
	}

}
