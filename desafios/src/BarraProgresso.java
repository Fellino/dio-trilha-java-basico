public class BarraProgresso {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print("Progresso: ");
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }
            System.out.println();
        }        
    }
}