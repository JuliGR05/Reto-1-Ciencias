import java.util.Random;

public class Generador {

    //Con números aleatorios
    public static int[] generarMatrizAleatoria(int cantidad){
        int[] matriz = new int[cantidad];
        Random random = new Random();

    for (int i =0; i < matriz.length; i++){
        matriz[i] = random.nextInt(1000000);

    }
    return matriz;
    }

    //Con números menor a mayor (Ascendente)
    public static int[] generarMatrizAscendente(int cantidad){
        int[] matriz = new int[cantidad];

    for (int i =0; i < matriz.length; i++){
      matriz[i] = i+1;
    }
    return matriz;
    }

    //Con números de mayor a menor (Descendente)
    public static int[] generarMatrizDescendente(int cantidad){
        int[] matriz = new int[cantidad];

    for (int i =0; i < matriz.length; i++){
        matriz[i] = cantidad - i;
    }
    return matriz;
    }

    //Mostrando la matriz
    public static void mostrarMatriz(int[] matriz){
        for(int i= 0; i< matriz.length; i++){
        System.out.print(matriz[i] + " ");
    }
    System.out.println();
    }

    // Mostrar resumen para matrices grandes: primeros 10 y últimos 10 elementos
    public static void mostrarResumen(int[] matriz){
        int n = matriz.length;
        if (n <= 100) {
            mostrarMatriz(matriz);
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.print(matriz[i] + " ");
            }
            System.out.print("... ");
            for (int i = n - 10; i < n; i++) {
                System.out.print(matriz[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSorted(int[] matriz){
        for (int i = 1; i < matriz.length; i++){
            if (matriz[i-1] > matriz[i]) return false;
        }
        return true;
    }
}