// 1. Imprime un mensaje que diga tu nombre en lugar de "Hola Mundo!"
// 2.  Imprime 2 líneas: "Hola" y luego "Mundo" con un solo println
// 3. Añade un comentario sobre lo que hace cada línea del programa
// 4. Crea un comentario en varias líneas
// 5. Imprime tu edad, dni y ciudad
// 6. Explora los diferentes System.xxx.println(); más alla de "out"
// 7. Utiliza varios println para imprimir una frase
// 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos
// 9. Intenta ejecutar el programa sin el método main y observa el error
// 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compilalo
package helloworld;

public class HelloWorldExercises {
    public static void main(String[] args){
        // 1.
        System.out.println("Hola, me llamo Andres!");
        // 2.
        System.out.println("Hola\nMundo");
        // 3, 4.
        /*
         * public class HelloWorldExercises: define una clase pública llamada HelloWorldExercises.
         * public static void main(String[] args): método principal que inicia la ejecución del programa.
         * Dentro del método main, cada System.out.println() imprime en pantalla el mensaje especificado y añade un salto de línea al final.
         */
        // 5.
        System.out.println(33 + " " + 35854411 + " Ciudad Autónoma de Buenos Aires" );
        // 6.
        System.err.println("Este es un mensaje de error"); //el mensaje de error se diferencia del mensaje común cambiando de color
        // 7.
        System.out.println("Frase 1");
        System.out.println("Frase 2");
        System.out.println("Frase 3");
        System.out.println("Frase 4");
        // 8.
        System.out.println(":)");
        // 9. En est punto, si borro el método main, el programa no ejecuta nada (la JVM requiere el método main como punto de entrada).
        // 10.  Si el nombre de la clase pública no coincide exactamente con el nombre del archivo, el compilador arroja un error: "class HelloWorldExercise is public, should be declared in a file named HelloWorldExercise.java"
    }
}
