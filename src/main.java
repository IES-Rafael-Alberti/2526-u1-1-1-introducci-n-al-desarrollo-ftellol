import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = sc.nextLine();

        System.out.print("¿En qué año naciste? ");
        int ano_nacimiento = sc.nextInt();

        int edad = 2025 - ano_nacimiento;
        System.out.println("Hola " + nombre + ", tienes " + edad + " años. Este programa está hecho en el lenguaje de programación: Java.");
    }
}