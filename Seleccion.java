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

        long tiempoAleatorio = medirTiempo(aleatorio.clone());
        long tiempoAscendente = medirTiempo(ascendente.clone());
        long tiempoDescendente = medirTiempo(descendente.clone());

        System.out.println("\n ORDENAMIENTO POR SELECCIÓN ");
        System.out.println("Cantidad de elementos: " + cantidad);

        System.out.println("Aleatorio: " + tiempoAleatorio + " nanosegundos");
        System.out.println("Ascendente: " + tiempoAscendente + " nanosegundos");
        System.out.println("Descendente: " + tiempoDescendente + " nanosegundos");

        scanner.close();
    }
}