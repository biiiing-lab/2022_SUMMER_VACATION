# 클래스와 인스턴스
## 설계도(메서드 정의)와 제품(호출)

```java
public class calcul {
  public static void main(String[] args) {
    System.out.println(1 + 1);
    System.out.println(1 + 2); 
  }
}
```
- 중복되는 로직, 즉 코드가 없도록 해야함(=중복 제거)

```java
public class calcul2 {
  public static void sum(int a, int b);
  System.out.println(a + b);

  public static void main(String[] args) {
    sum(10, 2);
    sum(100, 10);
  }
}
```

=> 메서드 사용

## 객체화
```java
class calculator { // class = 객체 설계도
 static int base = 0; // 클래스 멤버, 특별한 값 지정하지 않을 시 선언한 값으로 지정
  int a, b; // 인스턴스 멤버

  public void setOprands(int a, int b) { // main에서의 input값 대입 
    this.a = a; // class 내 전역변수인 int a, b에 받은 input값 대입
    this.b = b; 
  }

  public void sum() {
    System.out.println(this.a + this.b);
  }

  public void avg() {
    System.out.println((this.a + this.b) / 2);
  } // 독립된 프로그램 취급, 프로그램 안에 변수와 메서드 지정

}

public class calcul3 {
  public static void main(String[] args) {
    calculator c = new calculator(); // 객체 생성, 인스턴스 멤버
    c.setOprands(10, 20);
    c.sum(); // 결괏값 15
    c.avg(); // 결과값 15

    calculator c2 = new calculator();
    c.setOprands(10, 30);
    c.sum(); // 결괏값 40
    c.avg();  // 결괏값 20

  }
}