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

        // Generar los mismos tipos de datos que en Selección
        int[] aleatorio = Generador.generarMatrizAleatoria(cantidad);
        int[] ascendente = Generador.generarMatrizAscendente(cantidad);
        int[] descendente = Generador.generarMatrizDescendente(cantidad);

        System.out.println("\n ORDENAMIENTO POR INSERCIÓN ");
        System.out.println("Cantidad de elementos: " + cantidad);

        // Aleatorio
        System.out.println("\nAleatorio - Antes:");
        Generador.mostrarResumen(aleatorio);

        int[] arrAleatorio = aleatorio.clone();

        long start = System.nanoTime();
        ordenar(arrAleatorio);
        long tiempoAleatorio = System.nanoTime() - start;

        System.out.println("Aleatorio - Después:");
        Generador.mostrarResumen(arrAleatorio);

        // Ascendente
        System.out.println("\nAscendente - Antes:");
        Generador.mostrarResumen(ascendente);

        int[] arrAsc = ascendente.clone();

        start = System.nanoTime();
        ordenar(arrAsc);
        long tiempoAscendente = System.nanoTime() - start;

        System.out.println("Ascendente - Después:");
        Generador.mostrarResumen(arrAsc);

        // Descendente
        System.out.println("\nDescendente - Antes:");
        Generador.mostrarResumen(descendente);

        int[] arrDesc = descendente.clone();

        start = System.nanoTime();
        ordenar(arrDesc);
        long tiempoDescendente = System.nanoTime() - start;

        System.out.println("Descendente - Después:");
        Generador.mostrarResumen(arrDesc);

        // Mostrar tiempos
        System.out.println();
        System.out.println("Tiempos:");
        System.out.println("Aleatorio: " + tiempoAleatorio + " nanosegundos (" 
                + (tiempoAleatorio / 1_000_000.0) + " ms)");

        System.out.println("Ascendente: " + tiempoAscendente + " nanosegundos (" 
                + (tiempoAscendente / 1_000_000.0) + " ms)");

        System.out.println("Descendente: " + tiempoDescendente + " nanosegundos (" 
                + (tiempoDescendente / 1_000_000.0) + " ms)");

        scanner.close();
    }
}