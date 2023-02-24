package primerParcial_Acker1.ej3;

public class Radio implements IArtefacto{
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void create() {
        System.out.println("Mostrando Informacion de una Radio....");
        System.out.println("Precio de la radio: " + getPrecio());
    }
}
