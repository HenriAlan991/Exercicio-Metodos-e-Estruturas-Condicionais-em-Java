public class App{
    // CÒDIGO PRINCIPAL
    public static void main(String[] args) {
        // Tenta ativar o modo soneca
        String mensagem = acionarAlarme(12, 35);
        System.out.println(mensagem);
        
    }

    // método static que retorna um valor booleano que se chama acionarSoneca e precisa de um argumento int chamado tempo
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

    static String acionarAlarme(int horas, int minutos){
        String horario = horas + ":" + minutos;
        String mensagem = "Seu alarme foi adiado para as: " + horario;
        return mensagem;


    }


    
}
