package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

            int wynik = 0;
        for (int i = 0; i < N; i++){
            int a = scanner.nextInt();

            wynik = wynik +a;

        }
        wynik = wynik / N;
        System.out.println(wynik);



    }

}
