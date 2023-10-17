public class Usuario {
    
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        

        System.out.println("TV ligada ? " +  smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligada();
        System.out.println("Novo status -> TV ligada ? " +  smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada ? " +  smartTv.ligada);

        smartTv.definirVolume(0);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.definirVolume(0);
        System.out.println("Volume Atual : " + smartTv.volume);


        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.definirCanal(20);
        System.out.println("Canal Atual : " + smartTv.canal);



    }

    
}
