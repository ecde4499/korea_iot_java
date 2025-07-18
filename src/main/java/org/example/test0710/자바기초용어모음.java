package org.example.test0710;

// 게시글 제목 본인이름_0710

public class 자바기초용어모음 {
}

/*
접근제한자
: 자바에서 변수나 메서드 클래스와 같은 데이터가 선언될 때 해당 데이터가 자바 내에서 활용될수 있는 범위를 지정

- public : 데이터를 가장 폭 넓게 사용 할 수 있으며 어디서든 해당 데이터를 호출하여 사용할 수 있음

- protected : 같은 패키지 내에서는 protected로 선언한 데이터를 사용할 수 있으며 다른 패키지에서 사용할 경우
해당 protected로 선언한 자료가 있는 클래스를 상속받은 자식 클래스 내에서만 사용가능

- default : 변수 메서드 클래스 선언 시 아무런 접근 제한자를 입력하지 않으면 기본적으로 설정되는 값으로 생략이 가능하다
데이터 사용 범위는 protected와 마찬가지로 같은 패키지 내에서 사용이 가능하지만, default는 다른 패키지에서는 사용이 불가하다.

- private : 가장 작은 데이터 활용 가능 범위로 private로 변수와 메서드 선언 시 해당 클래스 내에서만 사용이 가능하며,
만약 다른 클래스에서 해당 값에 대한 입력 및 호출을 하고 싶다면 getter 와 setter를 사용해야한다.

static

- static 변수 : 선언시 모든 클래스에서 해당 값을 공유

- static 메서드 : 여러 클래스에서 공통된 데이터을 가지고자 할때 사용, 인스턴스를 생성하지 않고 호출이 가능

final

-final 변수 : 선선시 값을 초기화 해줘야 하며 해당 값은 변할 수 없는 상수

-final 메서드 : 해당 메서드를 가진 A 클래스를 B 클래스에서 상속받아도 오버라이딩이 불가(재정의 불가)

-final 클래스 : final 클래스는 상속받을 수 없음

super Vs this

- super : 상속받은 클래스 내에 부모클래스 생성자와 같은 형식의 생성자가 존재 하지않을 경우 해당 생성자를 super 키워드를 이용해 호출 가능

- this : 메서드를 작성시 매개변수명이 해당 클래스의 변수명과 일치할 시 구분을 위해 this 키워드 사용
this가 붙은 키워드는 해당 클래스 내에 선언된 변수를 뜻함

오버로딩 vs 오버라이딩

- 오버로딩 : 한 클래스에서 같은 이름의 메서드를 매개변수의 차이를 두어 여러 개의 메서드를 만드는 것

- 오버라이딩 : 상속받은 클래스에서 부모클래스의 메서드를 재정의 하는 것

abstract

- abstract 클래스 : 추상 클래스로 해당 클래스는 반드시 추상 메서드를 1개 이상 갖고있어야 성립, 일반 메서드도 해당 클래스에서 구현 가능

- abstract 메서드 : 메서드를 선언시 구현부가 없는 형태의 메서드로 반드시 상속받은 자식 클래서에서 오버라이딩을 해야함

interface Vs abstract class

- interface : 일반 메서드를 가질 수 없으며, 구현할 수 있는 메서드는
abstract 메서드, default 메서드(오버라이딩 가능) static 메서드 3종류

- abstract class : 일반 메서드를 가질 수 있으며 반드시 추상 메서드가 1개 이상 있어야 성립

extends Vs implement

- extend : 클래스를 와 클래스 / 인터페이스와 인터페이스 사이 상속을 받을 때 사용하는 키워드, 다중상속 불가

- implement : 클래스에 약속된 인터페이스를 구현할때 사용하는 키워드, 클래스명 뒤에 붙으며 implement 뒤에는 인터페이스명을 입력,
여러개의 인터페이스를 적용 가능

try-catch-finally

- try : 예외사항이 발생할 수 있는 코드를 입력하는 블록

- catch : try 블록에서 예외 상황이 발생 시 catch 조건에 맞는 오류를 받아 구현부에 있는 코드를 실행, 다중 캐치 가능

- finally : 예외사항이 발생이 하던 안하던 finally 구현부에 있는 코드는 실행

 */
