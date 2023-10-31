public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double ValorSolicitado = 30.0;

        if(ValorSolicitado < saldo) {
            saldo = saldo - ValorSolicitado;

            System.out.println("Saldo atual " + saldo);
        }
        else    
        
            System.out.println("Saldo insuficiente " + "-" + " saldo " + saldo);
        

    }
}
