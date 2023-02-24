package primerParcial_Acker1.ej3;

public class Televisor implements IArtefacto{
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void create() {
        System.out.println("Mostrando Informacion de una television....");
        System.out.println("Precio del Televisor: " + getPrecio());
    }
}
