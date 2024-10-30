package chap_01;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {
        // 문자열 변수 선언
        String name;
        // 초기값 설정
        name = "홍길동";
        // String name = "홍길동"; // 문자열 변수 선언과 동시에 초기값 설정

        // 정수형 변수 선언과 초기값 설정
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        // 실수값 선언
        double score = 90.5;
        // char (한글자만 표현 할 때 - ''(작은 따옴표 안에))
        char grade = 'A';

        // name 변수 바꾸기
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        // boolean(true 또는 false 값을 가짐)
        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        // float (정밀한 숫자를 사용할 때는 double 자료형을 사용)
        double d = 3.14123456789;
        float f = 3.14123456789F; // float 자료형을 쓸 때는 뒤에 f,F를 작성해야지만 float로 인식
        System.out.println(d);
        System.out.println(f);

        // int 자료형의 범위 보다 초과 하면 값 넣을 수 없음
        // int i = 1000000000000; // 에러 발생
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

        // 정리
        // 정수를 표현 하는 자료형 int, long (long의 범위가 큼)
        // 실수를 표현 하는 자료형 float, double (double의 범위가 큼)
        // 하나의 문자열 표현 char ('')
        // 여러 문자열 표현 String ("")
        // 참과 거짓을 가지는 boolean
        // 작은 범위를 계산 하는 데 큰 자료 형을 사용하면 공간 낭비
        // 큰 자료형을 계산 하는 데 작은 자료형을 사용하면 올바른 계산이 안됨
    }
}
