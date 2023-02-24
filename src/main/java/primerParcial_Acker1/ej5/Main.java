package primerParcial_Acker1.ej5;

public class Main {
    public static void main(String[] args) {
        String ejercicio = "2 * 3 + 5 + 5 + 5";
        Evaluador e = new Evaluador("*"+ejercicio);
        System.out.println("El resultado del ejercicio es el siguiente>>> " + e.evaluarOperacion());
    }
}
