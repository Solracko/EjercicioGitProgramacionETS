import java.util.Scanner;

public class matrices7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos la matriz
        System.out.println("Introduce el número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.println("Introduce el número de columnas de la matriz ");
        int col = sc.nextInt();
        int [][] m = new int[filas][col];
        int mayor=0;
        String mayorposicion="0,0";



        // Pedimos los valores
        for (int x =0; x < m.length; x++){
            for (int y=0; y < m[x].length; y++){
                System.out.println("Posición de la matriz " +x+ ", " +y+ ": ");
                m[x][y] = sc.nextInt();
            }
        }
        // Buscamos el mayor comparando y los asignamos a la variable que ya habíamos creado
        for (int x =0; x < m.length; x++){
            for (int y=0; y< m[x].length; y++){
                if (m [x][y]  > mayor){
                    mayor = m [x][y];
                    mayorposicion = x + "," +y;
                }

            }

        }
        System.out.println("El mayor número de la matriz es " +mayor+ " y la posición del número mayor es " +mayorposicion);
    }

}
