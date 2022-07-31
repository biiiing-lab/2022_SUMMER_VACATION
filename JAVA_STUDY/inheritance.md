# 상속(inheritance)

## 상속이 무엇인가?
> 무언가를 물려준다는 의미이며, 어떠한 객체가 기존 객체에 있던 무언가를 물려받아 사용하는 것.
>

```java
class A {
    int a, b;
    
    public void sepO(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public void sum() {
        System.out.println(this.a + this.b);
    }
    
    public void div() {
        System.out.println(this.a / this.b);
    }

public class calcul {
    public static void main(String[] args) {
        A a = new A();

        a.sepO(10, 20);
        a.sum();
        a.div():
        a.sub(); // 추가
    }
}

```
- 기존의 객체를 그대로 유지하면서 어떠한 기능을 추가하는 것. 기존의 객체는 부모객체, 새로운 기능을 포함한 새로운 객체는 자식 객체라고 한다.
- 부모 클래스를 상위(super)클래스, 자식 클래스를 하위(sub) 클래스라 부르기도 하고, 기초 클래스(base class), 유도 클래스(derived class)라고도 한다.

---

## 상속 구체화
```java
class substraction extends A { // 하위클래스, 상위 클래스
    public void sub() {
        System.out.println(this.a - this.b);
    }
}
```
`substraction` 클래스는 `A` 클래스를 확장한다. (클래스 다이어그램 확인) 따라서 `substraction`이 실행이 될 때, `substaction`에 구성된 기능이 실행되는 동시에 `A` 클래스의 기능도 함께 실행된다.  


> 하나의 부모 클래스가 있으면 다양한 자식 클래스가 생길 수가 있다. 
>
> 또한 자식크래스는 부모 클래스가 될 수 있으며, 부모 클래스의 모든 내용을 가져온다.
>

* **유지보수가 간편하다**
- **중복 코드 제거**
- **코드 재활용**

---

## 상속과 생성자
### 기본 생성자 정의
```java
public class A {
    /*public A() {} 선언할 시 자동적으로 기본생성자를 만들어즘*/
    public A(int x) {} // 매개변수가 있으므로 기본생성자X 자동으로 만들지 않음.
    public static void main(String[] args) {
        A a = new A(); // 에러 발생
    }
}
```

부모 클래스의 생성자 자동 호출 -> 자바는 자동으로 생성자 생성X -> 부모 클래스에 기본 생성자 작성 `public 클래스명() {}` 

### super
- 상위클래스에 있는 생성자 코드와 하위클래스에 있는 코드가 겹칠 경우
```java
class substraction extends A {
    public substraction(int a, int b) {
        super(a, b);
    }
}
```
- super은 부모클래스를 의미함. 곧 '부모클래스 생성자'이다.
- 초기화 코드는 항상 super 이후에 작성.
