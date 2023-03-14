import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner opcao = new Scanner(System.in);
        Scanner val1 = new Scanner(System.in);
        Scanner val2 = new Scanner(System.in);
        Scanner operacao = new Scanner(System.in);
        Integer numero;
        Long valor1, valor2;
        String op;
        Boolean stop = true;

        while (stop) {
            System.out.println("-----calculadora-----");
            System.out.println();
            System.out.println("{1} soma ou subtração");
            System.out.println("{2} multiplicação ou divisão");
            System.out.println("{3} porcentagem");
            System.out.println("{4} sair");
            numero = opcao.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("escolha soma ou subtração");
                    System.out.println("digite o valor 1");
                    valor1 = val1.nextLong();
                    System.out.println("digite a operação desejada");
                    op = operacao.next();
                    System.out.println("digite o valor 2");
                    valor2 = val2.nextLong();
                    if ("+".equals(op)) {
                        System.out.println("o resultado da sua soma é:" + (valor1 + valor2));
                    } else if ("-".equals(op)) {
                        System.out.println("o resultado da sua subtração é:" + (valor1 - valor2));
                    } else {
                        System.out.println("operação invalida");

                    }
                     break;

                case 2:
                    System.out.println("escolha multiplicação ou divisão");
                    System.out.println("digite o valor 1");
                    valor1 = val1.nextLong();
                    System.out.println("digite a operação desejada");
                    op = operacao.next();
                    System.out.println("digite o valor 2");
                    valor2 = val2.nextLong();
                    if ("*".equals(op)) {
                        System.out.println("o resultado da sua multiplicação é:" + (valor1 * valor2));
                    } else if ("/".equals(op)) {
                        System.out.println("o resultado da sua divisão é:" + (valor1 / valor2));
                    } else {
                        System.out.println("operação invalida");
                    }
                    break;

                case 3:
                    System.out.println("selecione porcentagem ");
                    System.out.println("digite o valor 1");
                    valor1 = val1.nextLong();
                    System.out.println("digite % para calcular");
                    op = operacao.next();
                    System.out.println("digite o valor da porcentagem");
                    valor2 = val2.nextLong();
                    if ("%".equals(op)) {
                        System.out.println("o resultado da sua porcentagem é:" + valor1 * (valor2 / 100));
                    } else {
                        System.out.println("operação invalida");
                    }
                    break;

                case 4:
                    System.out.println(" calculadora encerrada ");
                    stop = false;
                    break;

                default:
                    System.out.println("opção invalida");
            }
        }
    }
}