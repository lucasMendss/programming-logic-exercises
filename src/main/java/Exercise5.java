public class Exercise5 extends Exercise{

    public static void implementation(){
        System.out.println(visualDivisor);
        System.out.println("Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que\n" +
                "o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância\n" +
                "percorrida e a quantidade de litros utilizados para fazer a viagem. (Litros usados = distância / 12).");

        int hours, km, speed;

        System.out.println("Informe a qtde. de horas de viagem:");
        hours = scanner.nextInt();

        System.out.println("Informe a velocidade média (km/h):");
        speed = scanner.nextInt();

        km = hours * speed;
        System.out.println("Dados:");
        System.out.printf("- Tempo de viagem: %d horas%n", hours );
        System.out.printf("- Velocidade média: %dkm/h%n", speed );
        System.out.printf("- Distância percorrida: %dkm%n", km );
        System.out.printf("- Quilômetros por litro: 12km/litro%n");
        System.out.printf("- Litros de combustível consumidos: %d litros%n", km/12 );
    }
}
