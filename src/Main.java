import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Conta c = new Conta("Paulo Chagas","Corrente",3000);
        int opcao = 0;
        double valor;
        Scanner leitura = new Scanner(System.in);
        while (opcao!= 4) {
            exibirOpcoes();
            opcao = leitura.nextInt();
            // validar entrada usuario
            if (!Arrays.asList(1,2,3,4).contains(opcao)) {
                System.out.println("Opção Inválida!");
            } else {
                switch (opcao) {

                    case 1:
                        c.consultarSaldo();
                        break;
                    case 2:
                        System.out.println("Digite o valor a Receber: ");
                        valor = leitura.nextDouble();
                        c.receberValor(valor);
                        break;
                    case 3:
                        System.out.println("Digite o valor a Transferir: ");
                        valor = leitura.nextDouble();
                        c.transferirValor(valor);
                        break;
                    case 4:
                        System.out.println("Muito Obrigado");

                }

            }


        }


    }

    private static void exibirOpcoes() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("""
                
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """);
    }
}
