public class SmartWatch extends  SmartDevice{
    boolean electrocardiograma=false;

    public SmartWatch() {
    }
    public SmartWatch(String id, String marca, String pantalla, int ram, boolean electrocardiograma) {
        super(id, marca, pantalla, ram);
        this.electrocardiograma=electrocardiograma;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "electrocardiograma=" + electrocardiograma +
                ", id='" + id + '\'' +
                ", marca='" + marca + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", ram=" + ram +
                '}';
    }
}
