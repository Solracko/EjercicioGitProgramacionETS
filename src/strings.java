import java.util.Scanner;
        /*Ejercicio 1
        Escribir por pantalla cada carácter de una cadena introducida por teclado.*/
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos la matriz
        System.out.println("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int col = sc.nextInt();
        int[][]m=new int[filas][col];

        // Pedimos los valores de la matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Posición " +i+ "," +j+ ": ");
                m[i][j] = sc.nextInt();

            }

        }
    }
}
