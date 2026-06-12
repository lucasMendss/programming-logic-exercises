public class Exercise1 extends Exercise {

    public static void implementation(){
        System.out.println(visualDivisor);
        System.out.println("Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. " +
                "\nFaça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.");

        double franciscoHeight = 1.5;
        double franciscoCmPerYear = 0.02;

        double saraHeight = 1.1;
        double saraCmPerYear = 0.03;

        int years = 0;
        do{
            franciscoHeight += franciscoCmPerYear;
            saraHeight += saraCmPerYear;
            years++;
        } while(saraHeight < franciscoHeight);

        System.out.printf("%nLevarão %d anos até que Sara fique maior que Francisco. Ela terá %.2fm de altura, e ele %.2f %n",
                years, saraHeight, franciscoHeight);
    }
}
