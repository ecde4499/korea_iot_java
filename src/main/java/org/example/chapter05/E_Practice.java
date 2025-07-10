package org.example.chapter05;

class BaseBallPlayer {
    // === 인스턴스 변수 ===
    // 선수 이름(name -  문자열)
    // 타율(battingAverage - 실수)
    // 홈런 수(homeRuns - 정수)
    String name;
    double battingAverage;
    int homeRuns;

    // === 정적(클래스) 변수 ===
    // : 생성된 선수의 총 인원(playerCount - 정수)
    // >> 모든 인스턴스에서 공유
    static int playerCount;

    // == 생성자 ==
    // +) 필드값 초기화 & 정적 변수 후위 증가
    BaseBallPlayer (String name, double battingAverage, int homeRuns) {
        this.name = name;
        this.battingAverage = battingAverage;
        this.homeRuns = homeRuns;
        playerCount++;
    }

    // 1) 인스턴스 메서드
    // : double newBattingAverage, int newHomeRuns 값을 전달 받아 각각의 타율과 홈런 수를 업데이트
    void updateStatus (double newBattingAverage, int newHomeRuns ) {
       // 필드값과 변수명이 출동나지 X
       // => this 키워드 생략 가능
        battingAverage = newBattingAverage;
       homeRuns = newHomeRuns;
    }

    // 2) 정적 메서드
    // : 특정 홈런 수 이상인 선수를 평가
    // : 홈런 수가 20개 이상이면 "홈런상 후보! 축하드립니다!"
    // : 미만일 경우 "홈런상 후보에 등록될 수 없습니다." 반환
    static String homeRunCount(int homeRunsCount) {
        if (homeRunsCount >= 20) return "홈런상 후보! 축하드립니다!";
        else return "홈런상 후보에 등록될 수 없습니다";
    }

}

public class E_Practice {
    public static void main(String[] args) {
        BaseBallPlayer player1 = new BaseBallPlayer("김태양",0.325,16);
        BaseBallPlayer player2 = new BaseBallPlayer("배혜진",0.295,20);
        BaseBallPlayer player3 = new BaseBallPlayer("최다영",0.301,11);
        BaseBallPlayer player4 = new BaseBallPlayer("이상은",0.292,21);

        System.out.println("총 생성된 선수의 수 : " + BaseBallPlayer.playerCount);

        player2.updateStatus(0.312,22);
        System.out.println(player2.battingAverage);
        System.out.println(player2.homeRuns);

        System.out.println(BaseBallPlayer.homeRunCount(player3.homeRuns));
        System.out.println(BaseBallPlayer.homeRunCount(player4.homeRuns));

    }
}
