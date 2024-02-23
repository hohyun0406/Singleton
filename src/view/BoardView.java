package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtillService;
import serviceImpl.UtillServiceImpl;

import java.util.ArrayList;
import java.util.List;


public class BoardView {
    public static void main(String[] args) {
        List<BoardDto> articles = new Arraylist<>();
        UtillService util = UtillServiceImpl.getInstance();


        for(List : articles){
            articles.add(new BoardBuilder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRandomName())
                    .build());
        }

    }
}
