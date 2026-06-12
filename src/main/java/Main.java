/*
* Autor: Lucas Mendes
* github.com/lucasMendss
* */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lastRunnedExercise = 0, option;
        boolean canFinish = false;

        do {
            System.out.println("----------------------------------------MENU----------------------------------------");
            System.out.printf("- Último exercício executado: %s%n", lastRunnedExercise == 0 ? "Nenhum" : String.valueOf(lastRunnedExercise));
            System.out.println("Digite o nº do Exercício a ser executado (1 a 8) ou 0 para encerrar programa:");

            try{
                option = scanner.nextInt();
            }
            catch(InputMismatchException ex){
                System.out.println("Valor inválido.");
                scanner.nextLine();
                continue;
            }

            switch (option) {
                case 0 -> canFinish = true;
                case 1 -> {
                    Exercise1.implementation();
                    lastRunnedExercise = 1;
                }
                case 2 -> {
                    Exercise2.implementation();
                    lastRunnedExercise = 2;
                }
                case 3 -> {
                    Exercise3.implementation();
                    lastRunnedExercise = 3;
                }
                case 4 -> {
                    Exercise4.implementation();
                    lastRunnedExercise = 4;
                }
                case 5 -> {
                    Exercise5.implementation();
                    lastRunnedExercise = 5;
                }
                case 6 -> {
                    Exercise6.implementation();
                    lastRunnedExercise = 6;
                }
                case 7 -> {
                    Exercise7.implementation();
                    lastRunnedExercise = 7;
                }
                case 8 -> {
                    Exercise8.implementation();
                    lastRunnedExercise = 8;
                }
                default -> System.out.println("Número inválido.");
            }
        } while (!canFinish);
    }
}
