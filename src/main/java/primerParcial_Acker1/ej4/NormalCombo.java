package primerParcial_Acker1.ej4;

public class NormalCombo extends BuilderCombo {
    @Override
    public void buildPipocas() {
        this.combo.setPipocas("Pipocas en envase normal");
    }

    @Override
    public void buildGaseosa() {
        this.combo.setGaseosa("1 refresco");
    }

    @Override
    public void buildChocolates() {
        this.combo.setChocolates("No cuenta con chocolates :( ");
    }
}
