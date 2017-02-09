package com.jihoon.designpatterns.strategy;

import com.jihoon.designpatterns.MainDesignPattern;

//������ ����ϴ� context ��ü
public class Soldier {
	public static final int NEAR = 0;
	public static final int FAR = 1;
	public static final int ATTACKED = 2;
	
	public int status = FAR; 
	public void useStrategy(Strategy strategy) {
		System.out.println("--- �������� ----");
		
		strategy.runStrategy();
		
		System.out.println("--- �������� ----");
	}
}
