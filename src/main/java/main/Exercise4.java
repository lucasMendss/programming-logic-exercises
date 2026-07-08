package main;

public class Exercise4 extends Exercise {

    public static void implementation(){
        System.out.println(visualDivisor);
        System.out.println("Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar\n" +
                "uma constante multiplicativa, que deverá multiplicar cada valor matriz e armazenar o resultado em outra matriz de\n" +
                "mesma ordem, nas posições correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por colunas.");
        double[][] matrix = new double[3][4];
        double[][] result = new double[3][4];
        int c = 1;

        System.out.println("Digite 12 valores: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(c + "° valor: ");
                matrix[i][j] = scanner.nextDouble();
                c++;
            }
        }

        System.out.print("Digite a constante multiplicativa: ");
        double constante = scanner.nextDouble();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = matrix[i][j] * constante;
            }
        }

        System.out.println("\nValores originais:");
        printMatrix(matrix);
        System.out.println("\nValores resultantes:");
        printMatrix(result);
    }

    private static void printMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%10.2f", m[i][j]);
            }
            System.out.println();
        }
    }
}
