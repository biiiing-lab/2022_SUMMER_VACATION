# 오버라이딩(Overriding)
## 1️⃣정의

- 오버라이딩 = 재정의
- 부모클래스의 기능을 갖고있으면서 자식 클래스만의 기능을 새로 정의하는 것을 의미함.

```java
class calcul {
int a, b;
public void set(int a, int b) {
this.a = a;
this.b = b;
}
public void sum() {
System.out.println(this.a + this.b);
}

class sub extends calcul {
public void sum() {
System.out.println("실행결과는 " + (this.a + this.b));
} // 오버라이딩, 실행결과값.
public void sub() {
System.out.println(this.a - this.b); 
}
}

```

→ 부모의 메서드인 `sum()` 이 아닌 자식의 클래스의 `sum()`이 실행된다.

## 2️⃣ 오버라이딩의 조건

- 부모의 자료형과 자식의 자료형이 다른 상태일 경우 오류 출력
- return 데이터 타입이 같아야함.
- 메소드명, 매개변수 타입, 개수 모두 동일 ⇒ **서명(signature)**이라고 함.

**+) 부모, 자식의 로직(코드)가 동일할 경우**

```java
public 자료형 메서드명() {
return super.메서드명(); // 부모 클래스를 나타내는 것
}
```

⭐ 부모 클래스와 동일한 코드를 반복하지 않고, 그대로 갖고오는 것.