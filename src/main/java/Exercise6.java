public class Exercise6 extends Exercise{

    public static void implementation(){
        System.out.println(visualDivisor);
        System.out.println("Entrar via teclado com o valor de cinco produtos. Após as entradas,\n" +
                "digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.");

        float total = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o valor do " + (i+1) + "° produto em R$: ");
            float valor = scanner.nextFloat();
            total += valor;
        }

        System.out.println("Digite o valor do pagamento em R$: ");
        float valorPagamento = scanner.nextFloat();

        if(valorPagamento < total){
            System.out.printf("Valor de pagamento insuficiente. O total da compra é de R$%.2f \n ", total);
        }
        else{
            System.out.printf("O valor do troco é de R$%.2f \n ", (valorPagamento - total));
        }
    }
}
