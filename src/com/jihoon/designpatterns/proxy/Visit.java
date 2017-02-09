package com.jihoon.designpatterns.proxy;

public class Visit {
	int no;
	int count = 0;
	public void increase(int bbsno) {
		// TODO Auto-generated method stub
		no = bbsno;
		count = count +1;
		//뒤로 로직을 더 작성 후
		// 데이터베이스에 저장
		
	}
}
