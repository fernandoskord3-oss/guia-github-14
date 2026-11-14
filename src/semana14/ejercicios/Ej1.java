package semana14.ejercicios;

public class Ej1 {
    // Regla: es unchecked si es RuntimeException o Error (o subclase); si no, es checked.
    static String clasificar(Class<?> c) {
        boolean unchecked = RuntimeException.class.isAssignableFrom(c)
                         || Error.class.isAssignableFrom(c);
        return unchecked ? "unchecked" : "checked";
    }

    public static void main(String[] args) {
        Class<?>[] excepciones = {
            IllegalArgumentException.class,       // a
            java.io.IOException.class,            // b
            OutOfMemoryError.class,               // c
            IndexOutOfBoundsException.class,      // d
            ClassNotFoundException.class,         // e
            InterruptedException.class            // f
        };
        char letra = 'a';
        for (Class<?> c : excepciones) {
            System.out.println(letra + ") " + c.getSimpleName() + " -> " + clasificar(c));
            letra++;
        }
    }
}
