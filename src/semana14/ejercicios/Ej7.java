package semana14.ejercicios;

/*
 * VERSION CON ERRORES (Ej7Mal, no compila):
 *
 *   try {
 *       Class.forName("Habitacion");
 *       int n = Integer.parseInt("x");
 *   } catch (RuntimeException e) {
 *       System.out.println("En ejecucion");
 *   } catch (NumberFormatException e) {     // error: exception NumberFormatException has already been caught
 *       System.out.println("Formato");
 *   }
 *   // y ademas: unreported exception ClassNotFoundException; must be caught or declared to be thrown
 *
 * VERSION CORREGIDA (la de abajo):
 */
public class Ej7 {
    public static void main(String[] args) {
        try {
            Class.forName("Habitacion");
            int n = Integer.parseInt("x");
        } catch (NumberFormatException e) {
            System.out.println("Formato");
        } catch (RuntimeException e) {
            System.out.println("En ejecucion");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }
}
