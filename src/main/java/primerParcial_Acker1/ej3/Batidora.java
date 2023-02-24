package primerParcial_Acker1.ej3;

public class Batidora implements IArtefacto{
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void create() {
        System.out.println("Mostrando Informacion de una batidora....");
        System.out.println("Precio de la batidora: " + getPrecio());
    }
}
