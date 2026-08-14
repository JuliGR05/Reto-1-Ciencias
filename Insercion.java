import java.util.Scanner;

public class Insercion {

    public static void ordenar(int[] matriz) {

        for (int i = 1; i < matriz.length; i++) {

            int actual = matriz[i];
            int j = i - 1;

            while (j >= 0 && matriz[j] > actual) {

                matriz[j + 1] = matriz[j];
                j--;
            }

            matriz[j + 1] = actual;
        }
    }

    public static long medirTiempo(int[] matriz) {

        long inicio = System.nanoTime();

        ordenar(matriz);

        long fin = System.nanoTime();

        return fin - inicio;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int cantidad = scanner.nextInt();

        int[] aleatorio = Generador.generarMatrizAleatoria(cantidad);
        int[] ascendente = Generador.generarMatrizAscendente(cantidad);
        int[] descendente = Generador.generarMatrizDescendente(cantidad);

        long tiempoAleatorio = medirTiempo(aleatorio.clone());
        long tiempoAscendente = medirTiempo(ascendente.clone());
        long tiempoDescendente = medirTiempo(descendente.clone());

        System.out.println("\n ORDENAMIENTO POR INSERCIÓN ");
        System.out.println("Cantidad de elementos: " + cantidad);

        System.out.println("Aleatorio: " + tiempoAleatorio + " nanosegundos");
        System.out.println("Ascendente: " + tiempoAscendente + " nanosegundos");
        System.out.println("Descendente: " + tiempoDescendente + " nanosegundos");

        scanner.close();
    }
}