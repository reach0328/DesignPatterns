package com.jihoon.designpatterns.proxy;

public class Database {
	public static Bbs readBbs(int bbsno) {
		Bbs bbs = new Bbs();
		
		// 데이터 세팅
		bbs.no = bbsno;
		bbs.title ="글제목";
		bbs.content = "내용입니다";
		
		// 데이터 세팅후 리턴
		return bbs;
	}
	
	public static void increase(int bbsno) {
		//Visit 데이터는 현재 bbs와 별개로 존재한다.
	}
	public static BbsExtend readBbsExtend(int bbsno) {
		BbsExtend bbs = new BbsExtend();
		
		// 데이터 세팅
		bbs.no = bbsno;
		bbs.title ="글제목";
		bbs.content = "내용입니다";
		bbs.count = 3;
		// 데이터 세팅후 리턴
		return bbs;
	}
}
