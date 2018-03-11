package pl.edu.ur.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        System.out.println("To jest zadanie numer 5:");
        for (int i = 20; i > 0; i--) {
            if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println();

        System.out.println("To jest zadanie numer 6:");
        while (true) {
                System.out.println("Podaj n");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                if(n<0){
                    break;
                }
        }
    }

}
