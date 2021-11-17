import java.util.Scanner;

public class TrabajoObligatorioPOO2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su apellido");
        String apellido = leer.next();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su hobbie preferido");
        String hobbie = leer.next();
        System.out.println("Ingrese el sistema operativo que utiliza");
        String sistema = leer.next();
    }
}

