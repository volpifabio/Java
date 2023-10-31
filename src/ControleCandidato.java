import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidato {
    public static void main(String[] args) {
            String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "GUSTAVO"};
            for(String candidato: candidatos) {
                entrandoEmContato(candidato);

            }

    }   
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
            do{
                atendeu=atender();
                continuaTentando = !atendeu;
                if(continuaTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");

            }while(continuaTentando && tentativasRealizadas <3);

            if(atendeu)
                System.out.println("Conseguimos contato com " + candidato + " na " 
                + tentativasRealizadas);
            else
                System.out.println("Não conseguimos contato com " + candidato + 
                ", numero maximo de tentativas " + tentativasRealizadas + " realizada");    

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "GUSTAVO"};

        System.out.println("Imprimindo lista de candidatos por indice");

        for(int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice+1) + " é 0" + candidatos[indice]);
    }
}
        
        /*System.out.println("Processo seletivo");

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
    
    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "GUSTAVO","MONICA","FABRICIO",
                                "MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido)
            System.out.println("Fazer contra proposta");
        else {
            System.out.println("Aguardar demais candidatos");
        }

    }
}