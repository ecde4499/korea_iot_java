package org.example.test0710.자바OOP구현문제;

interface Playable {
    String play();
}

class Piano implements Playable {
    @Override
    public String play() {
        return "땅땅";
    }
}

class Guitar implements Playable {
    @Override
    public String play() {
        return "띵띵";
    }
}

public class Q4 {
    public static void main(String[] args) {
        /*
        ### Q4. 인터페이스 구현
        Playable 이라는 인터페이스를 만든다.
        play() 메서드를 가진다.
        Piano, Guitar 클래스는 Playable을 구현하고 play() 메서드에서 각각 다른 악기 소리를 출력한다.
        Main 에서 다형성을 통해 모든 악기를 재생하라.
         */
        Piano piano = new Piano();
        Guitar guitar = new Guitar();

        System.out.println(piano.play());
        System.out.println(guitar.play());

    }
}
