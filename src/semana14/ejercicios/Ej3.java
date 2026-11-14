package semana14.ejercicios;

public class Ej3 {
    public static void main(String[] args) {
        // Para ver el error real, quita el // de UNA linea o bloque a la vez.

        // a) NO compila: unreported exception InterruptedException; must be caught or declared to be thrown
        // Thread.sleep(500);

        // b) NO compila: exception ArithmeticException has already been caught
        // try { int x = 4 / 0; } catch (Exception e) { } catch (ArithmeticException e) { }

        // c) NO compila: exception ClassNotFoundException is never thrown in body of corresponding try statement
        // try { System.out.println("Hola"); } catch (ClassNotFoundException e) { }

        // d) SI compila: una unchecked que no llega a ocurrir se puede atrapar
        try {
            System.out.println("d) Hola");
        } catch (ArithmeticException e) {
            System.out.println("No ocurre");
        }

        // e) SI compila (pero falla al ejecutar con ArithmeticException). Se deja protegida para poder ejecutar:
        try {
            int x = 4 / 0;
        } catch (ArithmeticException e) {
            System.out.println("e) compila, pero fallo al ejecutar: " + e.getMessage());
        }
    }
}
