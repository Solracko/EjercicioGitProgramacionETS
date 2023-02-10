import java.util.Scanner;

public class strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Introduce la subcadena: ");
        String subcadena = sc.nextLine();

        if (cadena.startsWith(subcadena)) { // En vez de hacerlo con substring, startsWith comprueba directamente si la subcadena que da comienzo a la cadena
            System.out.println("La cadena empieza por la subcadena indicada. ");
        }
        else{
                System.out.println("La cadena NO empieza por la subcadena indicada");
        }
    }
}
