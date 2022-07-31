## 1️⃣ 패키지

→ 비슷한 목적으로 생성된 클래스 파일들을 한 곳에 모아 둔 폴더. 한 프로젝트에 1개의 패키지만을 사용할 수 있기도 하고 여러개의 패키지를 사용할 수도 있다.

- 클래스의 충돌을 방지할 수 있다.

---

## 2️⃣ 임포트

→ 다른 패키지 내의 클래스를 사용하기 위한 문법 요소.

### 사용 방법

1. **클래스의 풀네임 사용** `패키지명.클래스명` 

```java
package one;

public class A {
public int x = 3;

public void print() {
System.out.println("안녕")
}
}
```

```java
package two;

public class B {
public static void main(String[] args) {
one.A a = new one.A(); // 패키지 명을 포함한 풀네임 사용

System.out.println(a.x);
a.print();
}
}
```

1. **임포트 사용** `import 패키지명.클래스명`

```java
package three;

import one.A;

public class C {
public static void main(String[] args) {
A a = new A();

System.out.println(a.x)
a.print();
}
}
```

⭐ 기호로 임포트를 할 경우, 어떠한 파일이 임포트 되는지 하위 클래스 파일을 잘 구분하여 사용하여야 한다. 

---

## 3️⃣ 외부 클래스

→ `public` 클래스의 외부에 추가로 정의한 클래스이다. 1개의 자바 파일에는 하나의 `public class`만 존재할 수 있으며, 파일명이 일치해야 하기 때문에 `public class`를 제외한 모든 클래스는 외부클래스이다.

```java
class A {} // 다른 패키지에서 임포트 불가능

public class B {} // 파일명 = 클래스명, 다른 패키지에서 임포트 가능
```

⇒ `class A`를 사용하고자 하면 새로운 파일을 만들어서 `public class`로 분리하여 사용한다.