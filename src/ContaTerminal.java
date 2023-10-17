import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);


        System.out.println("Digite o numero da agencia");
        int Agencia = sc.nextInt(); 

        System.out.println("Digite o numero da conta");
        int NumeroConta = sc.nextInt();

        System.out.println("Digite seu nome completo");
        String NomeCliente = sc.next();

        System.out.println("Deseja ver o saldo ?  (sim ou não) ");
        sc.nextLine();
        String Resposta = sc.nextLine();


        if(Resposta.equalsIgnoreCase("sim")){
            Double saldo = 100.00;
            System.out.println("Seu saldo é de: " + saldo);

        }else if(Resposta.equalsIgnoreCase("não"))
        {
            System.out.println("O que voce deseja fazer? ");
            String acao = sc.nextLine();

            System.out.println("Voce escolheu fazer: " + acao);
            
        }
        else 
        {
            System.out.println("resposta incorreta. Por favor responda sim ou não");
        }   

        System.out.println("Agencia " + Agencia);
        System.out.println("Numero da conta " + NumeroConta);
        System.out.println("Cliente " + NomeCliente);
        double saldo = 100.00;
        System.out.println("saldo " + saldo);

        sc.close();


    }
}




        