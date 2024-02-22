package view;

import builder.SubjectBuilder;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        System.out.println("국어점수 : ");
        System.out.println("영어점수 : ");
        System.out.println("수학점수 : ");
        System.out.println("평균 점수를 구하시오.");

        System.out.println("=============성적표=============");
        SubjectDto subject = new SubjectBuilder()
                .korean(sc.nextInt())
                .english(sc.nextInt())
                .math(sc.nextInt())
                .build()
                ;
    }
}
