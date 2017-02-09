package com.jihoon.designpatterns.strategy;

public class StrategySheild implements Strategy {

	@Override
	public void runStrategy() {
		// TODO Auto-generated method stub
		bothHands();
		System.out.println("방패 막기");
	}

	private void bothHands() {
		System.out.println("양손으로 방패를 잡고");
	}

}
