package pl.edu.ur.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
        //ZADANIE 1
        
        System.out.println("To jest zadanie numer 1:");
        
        System.out.println("Podaj a");
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        
        System.out.println("Podaj b");
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();
        
        System.out.println("Podaj c");
        Scanner sd = new Scanner(System.in);
        int c = sd.nextInt();
        
        System.out.println("Δ = b²-4ac");
        int delta;
        delta = b*b - (4*a*c);
        System.out.print("Δ jest równa: ");
        System.out.println(delta);
        
        if(delta>0)
            
        System.out.println();
        System.out.println();
        
        //ZADANIE 5
        
        System.out.println("To jest zadanie numer 5:");
        for (int i = 20; i > 0; i--) {
            if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        
        //ZADANIE 6

        System.out.println("To jest zadanie numer 6:");
        while (true) {
            System.out.println("Podaj n");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }
        }
    }

}
