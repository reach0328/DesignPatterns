package com.jihoon.designpatterns.factorymethod;

/* 
 * FactoryMethod
 * ��ü�� �������ִ� ����
 * Ȯ���� �θ�Ŭ������ method�� �������̵��ؼ� ��ȯ���ش�
 * 
 */

public abstract class FactoryMethod {
	public abstract Product make();
	public abstract Packed pack(Product product);
}
