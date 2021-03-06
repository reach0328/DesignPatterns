# Design Pattern
설계패턴에 대해 이해합니다

## GOF Design Pattern
23가지의 디자인 패턴에 대해 이해합니다

## Creational (생성)
인스턴스 생성을 위한 패턴으로, 인스턴스를 생성하는 객체와 생성된 인스턴스사이의 연결(의존성)을 줄여준다

* Singleton
클래스의 인스턴스가 하나만 생성되도록 보장하며, 생성된 인스턴스를 공유할 수 있도록 만든 패턴

* Factory Method
인스턴스를 생성하는 인터페이스를 미리 정의하고, 인스턴스의 생성을 서브클래스에게 위임하는 패턴

* Abstract Factory
서로 관련성 있거나 독립적인 여러 인스턴스를 조립해서 결과 인스턴스를 만드는  패턴

* Prototype
생성할 인스턴스의 종류를 명세하는 데에 원형의 기본틀을 이용하고, 그 기본틀을 복사함으로써 새로운 인스턴스를 생성하는 패턴

* Builder
복잡한 인스턴스를 생성과 표현을 분리하여, 조합에 따라서 서로 다른 표현 결과를 만들 수 있게 하는 패턴

## Structural (구조)
클래스 및 객체들을 구성을 통해서 더 큰 구조로 만들 수 있게 해준다  

* Adapter
클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환하는 패턴

* Bridge
구현부에서 추상층을 분리하여, 각자 독립적으로 변형할 수 있게 하는 패턴

* Composite
인스턴스들의 관계를 트리 구조로 구성하여 부분-전체 계층을 표현하는 패턴, 사용자가 단일 인스턴스와 복합 인스턴스를 모두 동일하게 다룰수 있다

* Decorator
클래스에게 동적인 기능이나 임무를 추가하고 원본데이터를 가공하는 패턴

* Facade
복잡한 서브 시스템에 대해서 간단한 인터페이스(메뉴)를 제공하는 패턴

* Flyweight
유사한 인스턴스들 사이에 가능한 많은 데이터를 서로 공유하여 사용하도록 하여 메모리 사용량을 최소화하는 패턴

* Proxy
인스턴스 사이의 흐름제어 및 정보은닉을 하기 위해 대리 객체를 제공하는 패턴

## Behavioral (행동)
클래스와 객체들이 상호작용하는 방법 및 역할을 분담하는 방법을 정의한다

* Command
요청을 객체의 형태로 캡슐화하여 사용자가 보낸 요청을 나중에 이용할 수 있도록 매서드 이름, 매개변수 등 요청에 필요한 정보를 저장 또는 취소할 수 있게 하는 패턴

* Iterator
컨테이너(배열)의 반복에 있어서 일관된 인터페이스를 두어 순차적으로 접근할 수 있는 방법을 제공하는 패턴

* Mediator
한 집합에 속한 객체들의 상호작용을 캡슐화하는 객체를 정의하는 패턴

* Memento
객체의 상태값 저장을 통해 해당 객체가 이전 상태로 돌아갈 수 있도록 하는 패턴

* Observer
데이터를 바라보는 인스턴스들의 갱신을 자동으로 할 수 있게 하는 패턴

* Interpreter
약속된 규칙으로 정의된 언어를 해석하는 패턴

* State
상태를 일반적인 데이터 변수로 두지않고, 객체로 만들어 그 상태에 따른 행동을 변경할 수 있도록 하는 패턴

* Strategy
비슷한 객체들을 캡슐화하고, 교환이 가능하도록 만든 패턴

* Visitor
데이터(또는 객체)의 구조와 처리(기능)을 분리할 수있는 패턴. 구조 안을 돌아다니면서 작업

* Template Method
템플릿을 만들고, 템플릿의 구현을 서브클래스에 위임하는 패턴

* Chain of Responsibility
각종 요청에 대해서 그것을 처리할 수 있는 객체가 존재할 때가지 연속적으로 객체를 탐사하며 요청을 처리할 수 있는 객체를 찾아주는 패턴

## Additional
추가적인 디자인 패턴에 대해 이해합니다

* Multiton
싱글턴과는 반대되는 개념으로 요청시 항상 새로운 인스턴스를 생성하는 패턴

* Strategy Callback
전략패턴에서 전략객체를 class로 만들지 않고 익명객체로 직접 만들어서 주입하는 패턴


---------------------------------------------------


###**Design Patterns**

- **Singleton**
>  singleton pattern은 인스턴스가 사용될 때에 똑같은 인스턴스를 만들어 내는 것이 아니라, 동일 인스턴스를 사용하게끔 하는 것이 기본 전략이다. 프로그램상에서 동일한 커넥션 객체를 만든다던지, 하나만 사용되야하는 객체를 만들때 매우 유용하다.
```
public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 }
```
- **Multiton**
 - 싱글턴과 반대되는 개념이지만 new라는 의존성(dependency)을 제거해준다는 장점 이있다.
> 사용중인 이름있는 인스턴스만을 리스트로 갖고 싶을 때 사용합니다. 싱글턴과 유사하지만 싱글턴은 1개의 인스턴스를, 멀티턴은 n개의 인스턴스를 갖는 다는 점이 다릅니다.

- **Proxy**
![](http://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Proxy_pattern_diagram.svg/500px-Proxy_pattern_diagram.svg.png)
> 대리자로써 일을 맡기면 그 일을 처리하고 완료되면 그 결과를 알려주는 패턴입니다. 프록시 패턴의 잘 알려진 예로는 참조 횟수 스마트 포인터가 있다.
> 대행자로써 중간에 다른 기능 또는 요구사항을 처리한 후 클라이언트 요청에 대한 원본데이터는 변형하지 않고 그대로 전달한다.

- **Decorator**
> 객체에 추가적인 요건을 동적으로 첨가한다. 
데코레이터는 자식클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공한다
>> - 데코레이터의 부모클래스는 자신이 장식하고 있는 객체의 부모클래스와 같으며, 한 객체를 여러 개의 데코레이터로 감쌀 수 있다. 
>> - 또한 데코레이터는 자신이 감싸고 있는 객체와 같은 부모클래스를 가지고 있기 때문에 원래 객체가 들어갈 자리에 데코레이터 객체를 집어넣어도 상관 없다.(이게 포인트!  클래스 다이어그램을 보고 이해할수 있어야함) 
데코레이터는 자신이 장식하고 있는 객체에게 어떤 행동을 위임하는 것 외에 원하는 추가적인 작업을 수행할 수 있고 객체는 언제든지 감쌀 수 있기 때문에 실행에 필요한 데코레이터를 마음대로 적용할 수 있다.

- **TemplateMethod**
> 상위 클레스에서 처리의 흐름을 제어하며, 하위클래스에서 처리의 내용을 구체화한다.
> 여러 클래스에 공통되는 사항을 상위 추상 클래스에서 구현하고, 각각의 상세 부분을 하위클래스에서 구현한다. 코드의 중복을 줄이고, Refactoring에 유리한 패털으로 상속을 통한 확장 개발 방법으로써 전략패턴과 함께 가장 많이 사용되느 패턴 중에 하나이다.
>> - 맴버 함수들의 접근 범위 지정에 대한 명확화가 필요
>> - 가상함수, 일반함수로 선언에 대한 결정이 필요
>> - 재정의 함수(virtual)의 수를 줄이는 것이 필요(virtual table 확장에 따른 perfomance 문제점 발생) 

- **Factory Method**
> 팩토리 메소드 패턴에서는 객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만듭니다. 팩토리 메소드패턴을 이용하면 클래스의 인스턴스를 만드는 일을 서브클래스에게 맡기는 것이다.
> - 객체의 생성을 한군데서 관리할 수 있다.
> -  동일한 인터페이스 구현으로 새로운 객체가 추가되더라도 소스의 수정이 없다.
> - 제품을 생성하는 부분과 사용하는 부분을 분리

- **Strategy**
> - 스트래티지 패턴(Strategy pattern)에서는 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
> -  상속을 이용한 간단한 동물의 행동을 호출하는 시스템에서 스트래티지 패턴(Strategy pattern)을 적용하여 보겠습니다.
> - 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

- **Callback**
![](http://cfile29.uf.tistory.com/image/122C37544D3535FB1FE5CF)
> - 실행되는 것을 목적으로 다른 오브젝트의 메소드에 전달되는 오브젝트를 말한다.
특정 로직을 담은 메소드를 실행 시키기 위해 사용하는데, 자바에선 메소드 자체를 파라미터로 전달할 방법은 없기 때문에 메소드가 담긴 오브젝트를 전달해야 한다.
그래서 펑셔널 오브젝트(functional object)라고도 한다.


- **Observer Pattern**
![](https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTc_ygdI812TjEViX2f1Lv0oEqJqsMm2gARNh83EvCl_dZLf3dp)
> - 한객체의 상태가바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의한다.
> - 서로의 정보를 넘기고 받는 과정에서 정보의 단위가 클수록, 객체들의 규모가 클 수록, 각 객체들의 관계가 복잡할 수록 점점 구현하기 어려워지고 복잡성이 매우 증가할 것이다. 이러한 기능을 할 수 있도록 가이드라인을 제시해 주는 것이 바로 옵저버 패턴이다.


