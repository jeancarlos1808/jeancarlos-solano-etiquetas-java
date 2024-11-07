import java.util.ArrayList;

public class Main{
    public static void main (String[] args){
    private static final Random random = new Random();

    public static void main(String[] args) {
        if (args.length == 1) {
            int caras = Integer.parseInt(args[0]);
            int resultado = tirarDado(caras);
            System.out.println("Resultado del dado: " + resultado);
        } else if (args.length == 2) {
            int caras = Integer.parseInt(args[0]);
            int numeroDeDados = Integer.parseInt(args[1]);
            int[] resultados = tirarDados(caras, numeroDeDados);
            System.out.println("Resultados de los dados:");
            for (int resultado : resultados) {
                System.out.println(resultado);
            }
        } else {
            System.out.println("Por favor, proporciona uno o dos argumentos.");
        }
    }

    private static int tirarDado(int caras) {
        return random.nextInt(caras) + 1;
    }

    private static int[] tirarDados(int caras, int numeroDeDados) {
        int[] resultados = new int[numeroDeDados];
        for (int i = 0; i < numeroDeDados; i++) {
            resultados[i] = tirarDado(caras);
        }
        return resultados;
    }
}
