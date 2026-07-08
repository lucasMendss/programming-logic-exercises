package main;

public class Exercise2 extends Exercise {

    public static void implementation(){
        System.out.println(visualDivisor);
        System.out.println("Faça um algoritmo que imprima na tela a tabuada de 1 até 10");

        for(int i = 1; i <= 10; i++){
            System.out.println("-----------------");
            System.out.println("Tabuada do "+i+":");
            for(int j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
