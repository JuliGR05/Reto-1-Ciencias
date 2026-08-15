import java.util.Scanner;

public class Seleccion {

    public static void ordenar(int[] matriz) {

        for (int i = 0; i < matriz.length - 1; i++) {

            int posicionMenor = i;

            for (int j = i + 1; j < matriz.length; j++) {

                if (matriz[j] < matriz[posicionMenor]) {
                    posicionMenor = j;
                }
            }

            int aux = matriz[i];
            matriz[i] = matriz[posicionMenor];
            matriz[posicionMenor] = aux;
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

        System.out.println("\n ORDENAMIENTO POR SELECCIÓN ");
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

        System.out.println();
        System.out.println("Tiempos:");
        System.out.println("Aleatorio: " + tiempoAleatorio + " nanosegundos (" + (tiempoAleatorio/1_000_000.0) + " ms)");
        System.out.println("Ascendente: " + tiempoAscendente + " nanosegundos (" + (tiempoAscendente/1_000_000.0) + " ms)");
        System.out.println("Descendente: " + tiempoDescendente + " nanosegundos (" + (tiempoDescendente/1_000_000.0) + " ms)");

        scanner.close();
    }
}