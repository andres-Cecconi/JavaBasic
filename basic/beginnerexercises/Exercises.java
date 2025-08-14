package beginnerexercises;

public class Exercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Andres";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 34;

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.80;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean programmingTaste = true;

        // 5. Declara una constante con tu email.
        final String email = "ancecconi15@gmail.com";

        // 6. Crea una vaariable de tipo char y guárdale tu inicial.
        char inicial = 'A';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String city = "Ciudad Autonoma de Buenos Aires";
        city = "CABA";
        System.out.printf("Mi nombre es %s, tengo %d años y mido %.2f metros. Mi email es %s y como pueden ver mi inicial es %c. Vivo en %s%n", name, age, height, email, inicial, city);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 7;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("La variable city es de tipo " + city.getClass().getSimpleName() + ", y la variable age es de tipo " + ((Object) age).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int numero;
        numero = 45;
        System.out.println(numero);
    }
}
