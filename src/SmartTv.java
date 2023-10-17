public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    

    public void ligada(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume ++;
    }    

    public void diminuirVolume(){
        
        if(volume > 0){
            volume --;
        
            System.out.println("volume diminuido para: " + volume);
        }else{ 
            System.out.println("volume minimo");
        }        
    }

    public void definirVolume(int novoVolume){
        volume = novoVolume;
    }

    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        
        if(canal > 0){
            canal --;

            System.out.println("canal diminuido para: " + canal);
       }else{
            System.out.println("canal minimo");
       }     
                 
    }

    public void definirCanal(int novoCanal){
        canal = novoCanal;
    }
}
