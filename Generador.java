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
}