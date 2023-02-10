import java.util.Scanner;

public class strings1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            String subtext = texto.substring(i, i+1);
            System.out.println("Su cadena esta compuesta por: " +subtext);
        }


    }
}
