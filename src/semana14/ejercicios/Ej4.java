package semana14.ejercicios;

public class Ej4 {
    // "El catch atrapa" cuando el tipo lanzado ES una subclase (o la misma clase) del tipo del catch.
    static void probar(char letra, Class<?> lanzada, Class<?> catchTipo) {
        boolean atrapa = catchTipo.isAssignableFrom(lanzada);
        System.out.println(letra + ") " + lanzada.getSimpleName() + " con catch ("
                + catchTipo.getSimpleName() + ") -> " + (atrapa ? "Si" : "No"));
    }

    public static void main(String[] args) {
        probar('a', NumberFormatException.class, IllegalArgumentException.class);
        probar('b', NullPointerException.class, IndexOutOfBoundsException.class);
        probar('c', java.io.FileNotFoundException.class, java.io.IOException.class);
        probar('d', StackOverflowError.class, Exception.class);
        probar('e', ArithmeticException.class, Throwable.class);
    }
}
