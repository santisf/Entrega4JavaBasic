public class SmartPhone  extends SmartDevice{
    String camara;
    public SmartPhone() {
    }
    public SmartPhone(String id, String marca, String pantalla, int ram, String camara){
        super(id, marca, pantalla, ram);
        this.camara=camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara='" + camara + '\'' +
                ", id='" + id + '\'' +
                ", marca='" + marca + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", ram=" + ram +
                '}';
    }
}
