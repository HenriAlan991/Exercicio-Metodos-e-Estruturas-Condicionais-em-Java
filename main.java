public class App{
    // CÒDIGO PRINCIPAL
    public static void main(String[] args) {
        // Tenta ativar o modo soneca
        acionarSoneca(3);
        
    }


    static boolean acionarSoneca(int tempo){
        if (tempo <= 20 && tempo >= 1){
        System.out.println("Seu alarme foi adiado por mais " + tempo + ":00" + " minutos no modo soneca.");
            return true;
    }
        
        else if(tempo < 1){
            System.out.println("Insira um valor válido em tempo!");
            return false;
        }  
        else{
            System.out.println("Insira um valor menor que 20 Minutos em tempo!");
            return false;
        }
    }

    
}
