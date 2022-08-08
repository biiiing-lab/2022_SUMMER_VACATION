
# 1️⃣ 최상위 클래스 object


- 자바의 모든 클래스는 Object 상속을 받으며, 즉 Object 클래스는 자바의 최상위 클래스이다.
- 아무런 클래스로 상속하지 않으면 자동으로 `extends Object` 삽입 후 Object 클래스를 상속한다.

```java
class A { } // class A extends Object
class B extends A {} 
```

## ✅ Object 클래스의 주요 메서드

| 반환타입 | 메서드명 | 주요 내용  |
| --- | --- | --- |
| String | toString() | 일반적 오버라이딩 / 패키지.클래스명@해시코드  |
| boolean | equals(Object obj) | 입력매개변수 obj 객체와 stack 메모리값(번지) 비교 |
| int | hashCode() | 객체의 hashCode() 값 리턴, Hachtable, HashMap 등 비교 |
| void | wait() | 현재 쓰레드를 일시정지 상태로 전환 / 동기화 블록에서만 사용가능 |

### ⭐ toString() - 객체 정보를 문자열로 출력

- 객체 정보를 문자열로 리턴하는 메서드
- 실제 객체를 표현하고자 할 때는 대부분 객체 내 포함돼 있는 필드값을 출력

`System.out.println(인스턴스명.toString());`⇒ `toString` 메서드 호출

- 재정의 가능(overriding)

### ⭐ equlas -  객체와 객체가 같은지 판단

1. **false 값이 나오는 기본적인 내용**

```java
class A {
	String a;
	A(String a) {
		this.a = a;
	}
	
}

class B {
	public static void main(String[] args) {
	A a1 = new A("hi");
	A a2 = new A("hi");
	System.out.println(a1 == a2); 
	System.out.println(a1.equals(a2)); // false 값이 나오며, 그 이유는 스택 메모리 값을 비교하기 때문이다.
	}
}
```

1. **true 값이 나오도록 오버라이딩 기능 설정**

```java
class A { 
	String name;
	B(String name) {
		this.name = name;
} 

@Override
public boolean equals(Object obj) {
	if(obj instanceof B) { // 캐스팅 가능/불가능 확인하는 키워드
		if(this.name == ((B) obj).name);
			return true;
		}
		return false;
	}
}

class B {
	public static void main(String[] args) {
	A a1 = new A("hi");
	A a2 = new A("hi");
	System.out.println(a1 == a2); 
	System.out.println(a1.equals(a2)); // true값이 나온다.
	}
}
```

### ⭐ hashCode() - 객체의 위치와 연관된 값

- 객체의 위치와 관련된 값이므로 실제 위치를 나타내는 값이 아니다.
- Hashtable, HashMap 등에서 자료를 비교하고자 할 때, hashCode()까지 오버라이딩 해야한다.

**단계 정리**

<aside>
💡 HashMap : 데이터를 (Key, Value) 쌍으로 저장 ⇒ hashcode()값 비교 ⇒ 동일할 경우 equals() 메서드 호출 ⇒ true일 시 같은 객체로 인식

</aside>

```java
Class B {
	String name;
	B(Stirng name) {
		this.name = name;
}

@Override
public boolean equals(Object obj) {
	if(obj instanceof B) {
		if(this.name == ((B)obj).name) 
				return true;
	}
}

@Override
public int hashCode() {
	return name.hashCode(); 
}

@Override
public String toStirng() {
	return name;
	}
}
```

# 2️⃣ final


- 상속, 변경을 하지 못하는 기능. 한 번 정의된 변수 내 값을 수정하지 못함.

## ✅ final 필드

⇒ 한번 값이 정해진 이후에는 **변수 내의 값이 바뀌지 않도록 하는** 규제

```java
class A {
static final int a = 5; // 모든 지역에서 공통적, 바뀌지 않는 요소
int b = 6; }
```

- 후에 a의 값을 새로운 값으로 지정을 할 경우(내부, 외부 모두 해당) 오류 발생

## ✅ final 메소드

⇒ 사용 빈도는 높지 않다.

```java
class A {
final void B() {} }

class B extends A { 
void B() {} // 상속 오류 발생
```

## ✅ final 클래스

```java
final A {
final void b() {}

class C extends A {} // 상속 오류 발생 
```

# 3️⃣ abstract


- 한국어로는 ‘추상’ 이라고 정의한다. 간단하게 **상속을 강제하는 기능**이라고 생각할 수 있으며, abstract 클래스, 메서드를 이용하기 위해서는 반드시 상속을 하도록 하는 기능을 말한다.
- 직접적으로 사용하지 못한다.

## ✅ 문법

```java
abstract class lass Animal {
	void cry() { // 호출 효율성
	}
}

Class cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

Class dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}
```

```java
abstract class A { // 추상클래스
	public abstract int b(); // 추상메서드

	public void c() {
		System.out.println("hello") }
}

class B extends A { // 추상클래스 받기
	public int b() { // 추상메서드 받기
	return 1;
	}
}

public class C {
	public static void main(String[] args) {
		B b = new B();
	}
}
```

## ✅ 사용 이유

1. 추상 클래스를 정리하자면 상속을 강제하기 위한 규제라고 보면 된다.
2. 부모 클래스에는 **메서드의 시그니처**만을 정의한 후, 실제 내용, 방법은 메서드를 **상속 받은 하위 클래스가 동작**하므로 효율적으로 편하며, 오류가 나타날 경우 제대로 파악할 수 있다.
3. 따라서 사용자가 만든 하위 클래스가 작동하며, 맥락에 따라 달라질 수 있는 경우 추상 클래스를 주로 사용한다.