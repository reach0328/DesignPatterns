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
		//�ν��Ͻ� ������ �����ϱ����� �����ڸ� private
		//Singleton single2 = new Singleton();
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.printf("single1.name=%s single2.name =%s \n",single1.name,single2.name);
		single1.name = "ȫ�浿";
		System.out.printf("single1.name=%s single2.name =%s \n",single1.name,single2.name);
		
		//2. Multiton pattern
		Multiton multi1 = Multiton.newInstance();
		Multiton multi2 = Multiton.newInstance();
		System.out.printf("multi1.name=%s multi2.name =%s \n",multi1.name,multi2.name);
		multi1.name = "ȫ�浿";
		System.out.printf("multi1.name=%s multi2.name =%s \n",multi1.name,multi2.name);
		
		//2-1 . �̱��Ͽ� new Instance �Լ��� �߰��ϰ� ���� single3�� �������� single3.name�� ����غ�����
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
		
		
		// 6. ���� ������ ����մϴ�. Main�� Ŭ���̾�Ʈ
		Strategy strategy = null;
		Soldier context = new Soldier();
		context.status = Soldier.NEAR;
		
		// ���������� �����������̽��� ������ ����ü�� �����Ѵ�.
		if(context.status == Soldier.ATTACKED) {
			strategy = new StrategySheild();
		} else if(context.status == Soldier.NEAR){
			strategy = new StrategySword();
		} else {
			strategy = new StrategyGun();
		}
		// ������ ���ؽ�Ʈ�� �Ѱ� ����Ѵ�
		context.useStrategy(strategy);
		
		
		// 7. ���� callback ������ ����մϴ�
		// ���� ���ϰ� �����ѵ� ���� ��ü�� Ŭ���̾�Ʈ���� �͸�ü�� �����Ѵ�.
		Strategy strategy2 = null;
		Soldier context2 = new Soldier();
		context2.status = Soldier.ATTACKED;
		
		// ���� callBack�� ����ü�� ������� �ʰ� �͸� ��ü�� �ڵ�󿡼� �������ش�.
		if(context2.status == Soldier.ATTACKED) {
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					useSheid();
					System.out.println("���´�");
				}
				private void useSheid() {
					System.out.println("���и� ��տ� ���");
				}
			});	
		} else if(context2.status == Soldier.NEAR){
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					System.out.println("���");
				}
			});		
		} else {
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					System.out.println("���");
				}	
			});		
		}
		
		//8. ������ ����ϱ�
		//8-1. �������� ����ϱ� ���ؼ��� ������ ���� ���� �Ǿ�� �Ѵ�.
		KakaoTalkServer server = new KakaoTalkServer();
		
		new User(server,"park");
		new User(server,"kim");
		new User(server,"lee");
//		park.addMessage("�ȳ��ϼ���");
		// ������ ����  ������ ����.
		server.sendMessage("�ѽð��� ������ ���ýð��Դϴ�.");
		
	}
}