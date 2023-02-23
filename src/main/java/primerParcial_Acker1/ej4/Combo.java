package primerParcial_Acker1.ej4;

public class Combo {
    private String pipocas;
    private String gaseosa;
    private String chocolates;

    public String getPipocas() {
        return pipocas;
    }

    public Combo setPipocas(String pipocas) {
        this.pipocas = pipocas;
        return this;
    }

    public String getGaseosa() {
        return gaseosa;
    }

    public Combo setGaseosa(String gaseosa) {
        this.gaseosa = gaseosa;
        return this;
    }

    public String getChocolates() {
        return chocolates;
    }

    public Combo setChocolates(String chocolates) {
        this.chocolates = chocolates;
        return this;
    }

    public void showInfo(){
        System.out.println("Mostrando informacion del combo.......");
        System.out.println("Pipocas: "+getPipocas());
        System.out.println("Gaseosa: "+getGaseosa());
        System.out.println("Chocolates: "+getChocolates());
    }

}
