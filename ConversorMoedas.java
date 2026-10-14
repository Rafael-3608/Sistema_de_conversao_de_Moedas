import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Bem-vindo a Casada da Moeda Brasileira-----");
        System.out.println("");
        int opcao;
        /*
         */
        do {

            System.out.println("Por favor, digite a opção da conversão que desejas que esteja disponível: ");
            System.out.println("Opção 1: Real para Dolar Americano");
            System.out.println("Opção 2: Dolar Americano para real");
            System.out.println("Opção 3: real para euro");
            System.out.println("(Caso contrário digite 0 para encerrar)");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("A opção selecionada foi de Real para Dolar Americano");
                    System.out.println("Digite o valor que será convertido: ");
                    double valor = scanner.nextDouble();
                    DecimalFormat valorDecimal = new DecimalFormat("0.00");
                    System.out.println("O valor inserido foi: R$:" + valorDecimal.format(valor));
                    double resultado = valor / 5;
                    System.out.println("O valor convertido para dolar ficou: D$:" + valorDecimal.format(resultado));

                    break;
                case 2:
                    System.out.println("A opção selecionada foi de Dolar Americano para Real");
                    System.out.println("Digite o valor que será convertido: ");
                    double valor2 = scanner.nextDouble();
                    DecimalFormat valorDecimal2 = new DecimalFormat("0.00");
                    System.out.println("O valor inserido foi: R$:" + valorDecimal2.format(valor2));
                    double resultado2 = valor2 * 5;
                    System.out.println("O valor convertido para real ficou: R$:" + valorDecimal2.format(resultado2));
                    break;

                case 3:
                    System.out.println("A opção selecionada foi de Real para euro");
                    System.out.println("Digite o valor que será convertido: ");
                    double valor3 = scanner.nextDouble();
                    DecimalFormat valorDecimal3 = new DecimalFormat("0.00");
                    System.out.println("O valor inserido foi: R$:" + valorDecimal3.format(valor3));
                    double resultado3 = valor3 / 5.57;
                    System.out.println("O valor convertido para euro ficou: E$:" + valorDecimal3.format(resultado3));
                    break;
                case 0:
                    System.out.println("encerrando");
                    break;
                default:
                    System.out.println("Opção selecionada não existe");
                    break;
            }
        } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0);

        scanner.close();
    }
}