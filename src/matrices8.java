import java.util.Scanner;

public class matrices8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos la matriz
        System.out.println("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int col = filas;
        int [][]m = new int[filas][col];
        int suma = 0;

        // Pedimos los valores de la matriz
        for (int x=0; x < m.length; x++){
            for (int y=0; y <m[x].length; y++){
                System.out.println("Posición " +x+ "," +y+ ": ");
                m[x][y] = sc.nextInt();
            }
        }

        for (int i=0; i<m.length; i++){
            suma += m[i][i];
        }
        System.out.println(suma);




    }
}
