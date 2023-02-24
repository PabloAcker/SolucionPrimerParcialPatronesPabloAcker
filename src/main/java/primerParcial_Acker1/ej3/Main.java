package primerParcial_Acker1.ej3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================");
        String artefacto1 = "televisor";
        FactoryArtefacto.make(artefacto1).create();

        System.out.println("=================================");
        String artefacto2 = "batidora";
        FactoryArtefacto.make(artefacto2).create();

        System.out.println("=================================");
        String artefacto3 = "microondas";
        FactoryArtefacto.make(artefacto3).create();

        System.out.println("=================================");
        String artefacto4 = "radio";
        FactoryArtefacto.make(artefacto4).create();

        System.out.println("=================================");
        String artefacto5 = "refrigerador";
        FactoryArtefacto.make(artefacto5).create();
    }
}
