public class Resultado {
    public static void main(String[] args) {
        int cantidad =10;

        int[] aleatorio = Generador.generarMatrizAleatoria(cantidad);
        int[] ascendente = Generador.generarMatrizAscendente(cantidad);
        int[] descendente = Generador.generarMatrizDescendente(cantidad);

        System.out.println("Matriz aleatoria");
        Generador.mostrarMatriz(aleatorio);

        System.out.println("Matriz ascendente");
        Generador.mostrarMatriz(ascendente);

         System.out.println("Matriz descendente");
        Generador.mostrarMatriz(descendente);
    }
}