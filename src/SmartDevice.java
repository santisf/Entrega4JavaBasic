public abstract class SmartDevice {

    public SmartDevice() {};
    String id;
    String marca;
    String pantalla;
    int ram;

    public SmartDevice(String id, String marca, String pantalla, int ram) {
        this.id = id;
        this.marca = marca;
        this.pantalla = pantalla;
        this.ram = ram;
    }

}
