public class ResultadoEscolar {
    public static void main(String[] args) {
        
        /*int nota = 4;

        if(nota >= 7) 
            System.out.println("Aprovado");
        
        else if(nota >=5 && nota < 7)
            System.out.println("Ficou para recuperação");

        else
            System.out.println("Reprovado");    
        */    

        // código ternário
        
        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 
                                    ? "Prova Recuperação" : "Reprovado";
            System.out.println(resultado);
        
    }
}
