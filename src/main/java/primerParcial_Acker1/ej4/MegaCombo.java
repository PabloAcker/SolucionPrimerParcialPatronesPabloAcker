package primerParcial_Acker1.ej4;

public class MegaCombo extends BuilderCombo {
    @Override
    public void buildPipocas() {
        this.combo.setPipocas("EXTRA GRANDES");
    }

    @Override
    public void buildGaseosa() {
        this.combo.setGaseosa("3 vasos de gaseosas extragrandes con recarga ilimitada");
    }

    @Override
    public void buildChocolates() {
        this.combo.setChocolates("2 chocolates grandes");
    }
}
