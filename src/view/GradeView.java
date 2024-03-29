package view;

import builder.SubjectBuilder;
import builder.UserBuilder;
import model.SubjectDto;
import model.UserDto;
import service.GradeService;
import service.UtillService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtillServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        System.out.println("국어점수 : ");
        System.out.println("영어점수 : ");
        System.out.println("수학점수 : ");
        System.out.println("평균 점수를 구하시오.");

        Scanner sc = new Scanner(System.in);
        UtillService util = UtillServiceImpl.getInstance();


        UserDto student23 = new UserBuilder()
                        .name(sc.next())
                        .build();

        SubjectDto subjects = new SubjectBuilder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();

        GradeService grade = GradeServiceImpl.getInstance();
        int totalScore = grade.getTotalScore();
        double average = grade.findAvg();



        System.out.printf("=============성적표=============\n+" +
                " Name : %s \n" +
                " Korean : %s \n" +
                " English %s \n" +
                " Math %s \n" +
                " Total %s \n" +
                " Average %s \n",
                String.valueOf(subjects.getKorean()),
                String.valueOf(subjects.getEnglish()),
                String.valueOf(subjects.getMath()),
                String.valueOf(totalScore),
                String.valueOf(average));

    }
}
