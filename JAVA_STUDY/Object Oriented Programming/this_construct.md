# this
```java
class A {
    int a = 10;
    
    void m() {
        int v = 20;
        System.out.println(v); // 지역, 전역변수
        System.out.println(this.v);//인스턴스 값 자체(전역변수 a=10)
    }
}

public class B {
    public static void main(String[] args) {
        A a1 = new A();
        a1.m(); // 출력값 20
    }
}
```
- 유효범위 : 전역변수와 지역변수로 나누어서 표현
- 매개변수 정보

# 초기화와 생성자
## 객체이용
```java
class calculator {
    int a, b;
    public calculator (int a, int b) { // calculator = 생성자(constructor)
        this.a = a;
        this.b = b;
    }
    public void sum() {
        System.out.println(this.a + this.b);
    }
    public void avg() {
        System.out.println(this.a / this.b);
    }
}

calculator c = new calculator(10, 5); // 처음 객체 사용하기 전 값 입력
c.sum();
c.avg();
```
- 클래스 이름과 메서드 명이 같은 경우, 같은 이름의 메서드가 첫번째 사용

- `new 메서드명(값, 값)`이며 이를 생성자라고 부른다.