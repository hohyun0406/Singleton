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
        UtillService util = UtillServiceImpl.getInstance();

        UserDto person = new UserBuilder()
                .height(util.createRandomDouble(150, 50))
                .weight(util.createRandomDouble(30, 70))
                .build();
        KaupService kaup = KaupServiceImpl.getInstance();

        String bmi = kaup.createBmi(person);
        String bodyMass = kaup.createBodyMass();


        System.out.printf("========BMI 계산기========\n" +
                "BMI : %s\n" +
                "체질량 : %s\n" +
                "======================",
                bmi, bodyMass);
    }
}
