package uade;

public class Clase_1 {

    //Resolucion de ejercicios
    // Escriba un metodo que reciba un numero y determine si es par
    public String esPar(int n){
        if (n % 2 == 0){
            return String.format("El numero %d es par", n);
        } else {
            return String.format("El numero %d es impar", n);
        }
    }

}
