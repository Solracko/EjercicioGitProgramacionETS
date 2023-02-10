import java.util.Scanner;

public class matrizsumafilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos la matriz
        System.out.println("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int col = sc.nextInt();
        int [][]m= new int[filas][col];
        int suma=0;

        // Pedimos los valores de la matriz
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Posición " +i+ "," +j+ ": " );
                m[i][j] = sc.nextInt();

            }
        }
        // Se crea el vector para guardar la suma de cada fila
        int []v = new int[filas];

        //Se calcula la suma de cada fila
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];


            }
            v[i] = suma;
            suma = 0;
        }
    }
}