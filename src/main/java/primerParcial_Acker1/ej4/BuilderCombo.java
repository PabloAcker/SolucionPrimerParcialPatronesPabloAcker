package primerParcial_Acker1.ej4;

public abstract class BuilderCombo {
    protected Combo combo;

    public Combo getCombo(){
        return combo;
    }

    public void prepararCombo() {
        combo = new Combo();
    }

    public abstract void buildPipocas();
    public abstract void buildGaseosa();
    public abstract void buildChocolates();
}
