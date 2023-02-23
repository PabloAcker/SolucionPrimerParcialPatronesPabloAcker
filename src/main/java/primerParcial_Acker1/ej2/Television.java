package primerParcial_Acker1.ej2;

public class Television implements ITelevision {

    private String sistemaOperativo;
    private String versionSistemaOperativo;
    private int pulgadas;
    private int resolucion;
    private boolean hdmi;
    private int puertoUsb;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serial;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public void setHdmi(boolean hdmi) {
        this.hdmi = hdmi;
    }

    public int getPuertoUsb() {
        return puertoUsb;
    }

    public void setPuertoUsb(int puertoUsb) {
        this.puertoUsb = puertoUsb;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public Television clone() {
        Television tele = new Television();
        tele.setSistemaOperativo(this.sistemaOperativo);
        tele.setVersionSistemaOperativo(this.versionSistemaOperativo);
        tele.setPulgadas(this.pulgadas);
        tele.setResolucion(this.resolucion);
        tele.setHdmi(this.hdmi);
        tele.setPuertoUsb(this.puertoUsb);
        tele.setBluetooth(this.bluetooth);
        tele.setControlRemoto(this.controlRemoto);
        tele.setSerial(this.serial);
        return tele;
    }
    public void showInfo(){
        System.out.println("============================================================");
        System.out.println("Mostrando informacion del Televisor.....");
        System.out.println("Sistema Operativo: "+getSistemaOperativo());
        System.out.println("Version del Sistema Operativo: "+getVersionSistemaOperativo());
        System.out.println("Pulgadas: "+getPulgadas());
        System.out.println("Resolucion: "+getResolucion());
        System.out.println("Puerto Hdmi: "+isHdmi());
        System.out.println("Numero de puertos USB: "+getPuertoUsb());
        System.out.println("Bluetooth: "+isBluetooth());
        System.out.println("Control Remoto: "+isControlRemoto());
        System.out.println("Serial: "+getSerial());
    }
}
