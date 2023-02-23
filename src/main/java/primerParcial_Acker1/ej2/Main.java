package primerParcial_Acker1.ej2;

public class Main {
    public static void main(String[] args) {
        Television tele = new Television();
        tele.setSistemaOperativo("Android");
        tele.setVersionSistemaOperativo("11.0");
        tele.setPulgadas(80);
        tele.setResolucion(50);
        tele.setHdmi(true);
        tele.setPuertoUsb(4);
        tele.setControlRemoto(true);
        tele.setBluetooth(true);
        tele.setSerial("0000000000");

        Television t2 = tele.clone();
        t2.setSerial("0720291867");

        Television t3 = tele.clone();
        t3.setSerial("0987654321");

        Television t4 = tele.clone();
        t4.setSerial("0763687535");

        Television t5 = tele.clone();
        t5.setSerial("3578854347");

        Television t6 = tele.clone();
        t6.setSerial("5949467666");

        t2.showInfo();
        t3.showInfo();
        t4.showInfo();
        t5.showInfo();
        t6.showInfo();
    }
}
