package com.jihoon.designpatterns.strategy;

public class StrategySheild implements Strategy {

	@Override
	public void runStrategy() {
		// TODO Auto-generated method stub
		bothHands();
		System.out.println("���� ����");
	}

	private void bothHands() {
		System.out.println("������� ���и� ���");
	}

}
