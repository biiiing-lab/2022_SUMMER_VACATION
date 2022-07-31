# method : 메서드(함수, function)

## 메서드 형식
```java
public static void main(String[] args) {
  System.out.println("hello");
} // 메인메서드
```

---

## 메서드 정의와 호출
```java
public class method1 {
  public static void main practice1() {
    for(int i = 0; i < 10; i++) {
      System.out.println("*");
    }
  }
  }

public static void main(String[] args) {
  practice1();
}
```
**public static 안에 있는 practice1은 class method1에 있는 practice1이 실행된다.**

---

## main
-> 자바와 자바 개발자 사이의 약속이며, ```java public static void main(String[] args)``` 를 메인함수로 사용한다.

**❓ 메서드의 기능?**
>코드의 양 줄이기, 재활용 多, 유지보수
>

---
## 메서드 구체화

### 입력

#### 매개변수 인자
```java
public class method1 {
  public static void main practice1(int limit) {
    for(int i = 0; i < limit; i++) {
      System.out.println("*");
    }
  }
  }

public static void main(String[] args) {
  practice1(5);
}
```
=> 매개변수를 받아서 받은 매개변수를 int limit에 저장한 후, 메서드 실행

- 함수 내 따로 고정 변숫값을 설정하지 않고 가변 변숫값으로 다양하게 사용 가능하다. 변수 값을 여러개 설정해도 가능하다.

```java
public class method1 {
  public static void main practice1(int i, int limit) {
    for(i ; i < limit; i++) {
      System.out.println("*");
    }
  }
  }

public static void main(String[] args) {
  practice1(1, 5);
}
```
### 출력
**return 키워드 사용**
```java
public class method1 {
  public static void main practice1(int limit) {
    int result = 0;
    for(int i = 0; i < limit; i++) {
     result += i;
    }
    return result;
  }
  }

public static void main(String[] args) {
  int output = practice1(5);
  System.out.println(output);
}
```
- 'String' 사용 시, String 변수명 = ""이라고 선언한다. 
- 출력하는 방법에 따른 메서드를 염려해야한다. 부품으로서의 가치로 생각할 것.

### 파일 저장 방식
```java
try {
  BuffereWriter out = new BufferedWriter(new FileWriter("텍스트명")); // 텍스트 파일에 입력할 내용 저장
  out.write("입력할 내용");
  out.close();
} catch (IOException e)
```

## 메소드 특징
- `return`이 여러개의 경우에는 첫번째 리턴값만 받음.
- 조건문과 `return`이 같이 있을 경우에는 조건문에 맞는 값을 출력함.
- 여러개의 값을 리턴? -> `println`을 사용하여 출력하나, 배열을 사용하여 출력함.