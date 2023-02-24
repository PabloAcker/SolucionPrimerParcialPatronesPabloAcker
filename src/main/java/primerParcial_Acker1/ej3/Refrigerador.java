package primerParcial_Acker1.ej3;

public class Refrigerador implements IArtefacto{
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void create() {
        System.out.println("Mostrando Informacion de un Refrigerador....");
        System.out.println("Precio del refrigerador: " + getPrecio());
    }
}
