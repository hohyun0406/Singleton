package serviceImpl;

import service.UtillService;

public class UtillServiceImpl implements UtillService {

    private static UtillService instance = new UtillServiceImpl();

    private UtillServiceImpl(){}

    public static UtillService getInstance(){
        return instance;
    }

    public int createRandomInteger(int start, int gapBetweenStartAndEnd) {
        return start + (int)(Math.random() * gapBetweenStartAndEnd);
    }

    public double createRandomDouble(int start, int gapBetweenStartAndEnd) {
        int a = start + (int)(Math.random()*gapBetweenStartAndEnd);
        double b = ;
        return Math.round(a);

    }


}
