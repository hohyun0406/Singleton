package view;

import builder.UserBuilder;
import model.UserDto;
import service.KaupService;
import service.UtillService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtillServiceImpl;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtillService util = new UtillServiceImpl.getInstance();

        double h = util.createRandomDouble(start:150, gapBetweenStartAndEnd: 50);
        double w = util.createRandomDouble(start:30, gapBetweenStartAndEnd : 70);
        UserDto person = new UserBuilder()
                .height(h)
                .weight(w)
                .build();

        System.out.printf("키 : %.f cm, 몸무게 : %.1f kg ", person.);
        KaupService service = new KaupServiceImpl();

        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();
        System.out.println("========BMI 계산기=======");

        System.out.printf("BMI : %.1f", bmi);
        System.out.println();
        System.out.println("체질량 : " + bodyMass);
        System.out.println("===========BMI 계산기===========");


    }
}
