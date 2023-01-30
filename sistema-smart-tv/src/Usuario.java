public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
    
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(15);
        smartTv.desligar();
    }
}
