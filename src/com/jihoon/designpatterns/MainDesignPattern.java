package com.jihoon.designpatterns;

import com.jihoon.designpatterns.factorymethod.Product;
import com.jihoon.designpatterns.factorymethod.TVFactory;
import com.jihoon.designpatterns.observer.KakaoTalkServer;
import com.jihoon.designpatterns.observer.User;
import com.jihoon.designpatterns.proxy.Bbs;
import com.jihoon.designpatterns.proxy.Proxy;
import com.jihoon.designpatterns.singleton.Multiton;
import com.jihoon.designpatterns.singleton.Singleton;
import com.jihoon.designpatterns.strategy.Soldier;
import com.jihoon.designpatterns.strategy.Strategy;
import com.jihoon.designpatterns.strategy.StrategyGun;
import com.jihoon.designpatterns.strategy.StrategySheild;
import com.jihoon.designpatterns.strategy.StrategySword;
import com.jihoon.designpatterns.templatemethod.Frog;
import com.jihoon.designpatterns.templatemethod.Rabbit;
import com.jihoon.designpatterns.templatemethod.TemplateMethod;

public class MainDesignPattern {

	
	public static void main(String[] args) {

		//1. singleton pattern
		//인스턴스 생성을 방지하기위해 생성자를 private
		//Singleton single2 = new Singleton();
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.printf("single1.name=%s single2.name =%s \n",single1.name,single2.name);
		single1.name = "홍길동";
		System.out.printf("single1.name=%s single2.name =%s \n",single1.name,single2.name);
		
		//2. Multiton pattern
		Multiton multi1 = Multiton.newInstance();
		Multiton multi2 = Multiton.newInstance();
		System.out.printf("multi1.name=%s multi2.name =%s \n",multi1.name,multi2.name);
		multi1.name = "홍길동";
		System.out.printf("multi1.name=%s multi2.name =%s \n",multi1.name,multi2.name);
		
		//2-1 . 싱글턴에 new Instance 함수를 추가하고 변수 single3에 적용한후 single3.name을 출력해보세요
		Singleton single3 = Singleton.newInstance();
		System.out.printf("single3.name=%s \n",single3.name);
	
		
		// 3. Proxy Patterns
		Proxy proxy = Proxy.getInstance();
		Bbs bbs = proxy.getBbs(33);
		System.out.printf("Bbs.no =%d, Bbs.Title = %s Bbs.content = %s \n", bbs.no,bbs.title,bbs.content);		
		
		
		//4. template Method patterns
		TemplateMethod frog = new Frog();
		frog.play();
		TemplateMethod rabbit = new Rabbit();
		rabbit.play();
		
		
		//5. FactoryMethod pattern
		TVFactory factory = new TVFactory();
		Product product = factory.make();
		factory.pack(product);
		
		
		// 6. 전략 패턴을 사용합니다. Main이 클라이언트
		Strategy strategy = null;
		Soldier context = new Soldier();
		context.status = Soldier.NEAR;
		
		// 전락패턴은 전략인터페이스를 구현한 구현체를 주입한다.
		if(context.status == Soldier.ATTACKED) {
			strategy = new StrategySheild();
		} else if(context.status == Soldier.NEAR){
			strategy = new StrategySword();
		} else {
			strategy = new StrategyGun();
		}
		// 전략을 컨텍스트에 넘겨 사용한다
		context.useStrategy(strategy);
		
		
		// 7. 전략 callback 패턴을 사용합니다
		// 전략 패턴과 동일한데 전략 자체를 클라이언트에서 익명개체로 생성한다.
		Strategy strategy2 = null;
		Soldier context2 = new Soldier();
		context2.status = Soldier.ATTACKED;
		
		// 전략 callBack은 구현체를 사용하지 않고 익명 객체를 코드상에서 구현해준다.
		if(context2.status == Soldier.ATTACKED) {
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					useSheid();
					System.out.println("막는다");
				}
				private void useSheid() {
					System.out.println("방패를 양손에 잡고");
				}
			});	
		} else if(context2.status == Soldier.NEAR){
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					System.out.println("찌른다");
				}
			});		
		} else {
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					System.out.println("쏜다");
				}	
			});		
		}
		
		//8. 옵저버 사용하기
		//8-1. 옵저버를 사용하기 위해서는 서버가 먼저 생성 되어야 한다.
		KakaoTalkServer server = new KakaoTalkServer();
		
		new User(server,"park");
		new User(server,"kim");
		new User(server,"lee");
//		park.addMessage("안녕하세요");
		// 서버를 통해  공지를 띄운다.
		server.sendMessage("한시간만 잇으면 점시시간입니다.");
		
	}
}