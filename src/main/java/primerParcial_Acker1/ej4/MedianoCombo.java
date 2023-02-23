package primerParcial_Acker1.ej4;

public class MedianoCombo extends BuilderCombo {
    @Override
    public void buildPipocas() {
        this.combo.setPipocas("Pipocas grandes");
    }

    @Override
    public void buildGaseosa() {
        this.combo.setGaseosa("2 vasos de refresco");
    }

    @Override
    public void buildChocolates() {
        this.combo.setChocolates("1 chocolate");
    }
}
