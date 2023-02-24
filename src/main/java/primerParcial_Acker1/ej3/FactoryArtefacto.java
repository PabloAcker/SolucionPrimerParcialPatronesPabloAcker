package primerParcial_Acker1.ej3;

public class FactoryArtefacto {
    public static IArtefacto make (String type){
        IArtefacto artefacto = null;

        switch (type.toLowerCase()) {
            case "television" -> {
                artefacto = new Televisor();
                ((Televisor) artefacto).setPrecio(20000);
            }
            case "batidora" -> {
                artefacto = new Batidora();
                ((Batidora) artefacto).setPrecio(12307);
            }
            case "microondas" -> {
                artefacto = new Microondas();
                ((Microondas) artefacto).setPrecio(300);
            }
            case "radio" -> {
                artefacto = new Radio();
                ((Radio) artefacto).setPrecio(100);
            }
            case "refrigerador" -> {
                artefacto = new Refrigerador();
                ((Refrigerador) artefacto).setPrecio(800);
            }
        }
        return artefacto;
    }
}
