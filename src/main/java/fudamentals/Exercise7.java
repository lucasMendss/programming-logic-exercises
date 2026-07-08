package main;

public class Exercise7 extends Exercise {

    public static void implementation() {
        System.out.println(visualDivisor);
        System.out.println("Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas:\n" +
                "seno, cosseno, tangente e secante deste ângulo.");

        System.out.println("Digite o valor de um ângulo em graus (º):");
        double anguloEmGraus = scanner.nextDouble();

        double anguloEmRad = Math.toRadians(anguloEmGraus);
        double senoAngulo = Math.sin(anguloEmRad);
        double cossenoAngulo = Math.cos(anguloEmRad);
        double tangenteAngulo = Math.tan(anguloEmRad);
        double secanteAngulo = 1 / cossenoAngulo;

        System.out.printf("O seno de %.2fº mede %.3f \n", anguloEmGraus, senoAngulo);
        System.out.printf("O cosseno de %.2fº mede %.3f \n", anguloEmGraus, cossenoAngulo);
        System.out.printf("A tangente de %.2fº mede %.3f \n", anguloEmGraus, tangenteAngulo);
        System.out.printf("A secante de %.2fº mede %.3f \n", anguloEmGraus, secanteAngulo);
    }
}
