package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Если хотите играть введите 'старт'");
            String gameStEn = rd.readLine().toLowerCase(Locale.ROOT);
            if(gameStEn.equals("старт")){
                System.out.println();
                logicGame.game();
                System.out.println();
                System.out.println("Если хотите завершить игру введите 'Выход'");
                System.out.println();
            }
            if(gameStEn.equals("выход")){
                System.out.println("Конец игры, хорошего дня");
                break;
            }
        }
    }
}

