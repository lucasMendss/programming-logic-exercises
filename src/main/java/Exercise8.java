public class Exercise8 extends Exercise {

    public static void implementation() {
        System.out.println(visualDivisor);
        System.out.println("Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro,\n" +
                "se necessário. Após a digitação, exibir:\n" +
                " a. o maior valor\n" +
                " b. a soma dos valores\n" +
                " c. a média aritmética dos valores");

        float maior = Float.MIN_VALUE;
        float soma = 0;
        float media;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º valor: ");
            float num = scanner.nextFloat();

            if(num > maior){
                maior = num;
            }

            soma = soma + num;
        }

        media = soma / 10;
        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f %n", media);
    }
}
