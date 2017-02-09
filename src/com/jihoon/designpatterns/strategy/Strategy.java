package com.jihoon.designpatterns.strategy;

/*
 * Strategy
 * ���ø� ���ϰ� �����ѵ�, ���ø� ������ ����� �̿��ϴ� �ݸ�
 * Strategy ������ ��ü ������ ���� �پ��� ����� ������ �� �ִ�.
 * 
 * �⺻������ �Ʒ� 3��Ұ� �ʿ��ϴ�.
 * 1. ���� : ���� ������ �����ϴ� ��ü 
 * 2. ���ؽ�Ʈ : ������ ����ϴ� ��ü
 * 3. Ŭ���̾�Ʈ : ������ü�� ������ �� ���ؽ�Ʈ�� �����ϴ� ��ü
 * 
 */
public interface Strategy {
	public void runStrategy();
}
