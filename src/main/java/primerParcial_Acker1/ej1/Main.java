package primerParcial_Acker1.ej1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("7014HFL", "Camion", "Verde", 2);
        Vehiculo v1 = new Vehiculo("1489HDL", "Moto", "Rojo", 3);
        Vehiculo v2 = new Vehiculo("333JDL", "Furgoneta", "Amarillo", 4);
        Vehiculo v3 = new Vehiculo("333JJJ", "Minibus", "Azul", 5);
        Vehiculo v4 = new Vehiculo("0814KAD", "Deportivo", "Blanco", 6);
        Vehiculo v5 = new Vehiculo("3133LKD", "Vagoneta", "Negro", 7);

        System.out.println("=====================================");
        vehiculo.registro();
        vehiculo.dineroRecaudado();

        System.out.println("=====================================");
        v1.registro();
        v1.dineroRecaudado();

        System.out.println("=====================================");
        v2.registro();
        v2.dineroRecaudado();

        System.out.println("=====================================");
        v3.registro();
        v3.dineroRecaudado();

        System.out.println("=====================================");
        v4.registro();
        v4.dineroRecaudado();

        System.out.println("=====================================");
        v5.registro();
        v5.dineroRecaudado();
    }
}
