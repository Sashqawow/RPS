package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class logicGame {
    static void game() throws IOException {
        String[] selection = {"камень","ножницы","бумага"};
        int machineCode = new Random().nextInt(selection.length);
        String machine2 = selection[machineCode];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Играем в камень,ножницы,бумага!");
        System.out.println("Пользователь 1 введи свой вариант:");
        String player1 = reader.readLine();
        System.out.println("Пользователь 1 ввел " + player1);
        System.out.println("Пользователь 2 ввел " + machine2);
        if (player1.equals("камень") && machine2.equals("бумага")){
            System.out.println("Выиграл пользователь 2");
        }else if (player1.equals("бумага") && machine2.equals("ножницы")) {
            System.out.println("Выиграл пользователь 2");
        }else if (player1.equals("ножницы") && machine2.equals("камень")) {
            System.out.println("Выиграл пользователь 2");
        }else if(player1.equals(machine2)) {
            System.out.println("Ничья");
        } else {
            System.out.println("Выиграл пользователь 1");
        }
    }
}
