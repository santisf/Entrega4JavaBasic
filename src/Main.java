import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        SmartDevice celular1 = new SmartPhone();
        SmartDevice celular2 = new SmartPhone("asdas", "Samsung","amoled", 4, "Doble48px");
        SmartDevice reloj1=new SmartWatch("ghfhfg","apple","oled",4,true);
        System.out.println(celular1.toString());
        System.out.println(celular2.toString());
        System.out.println(reloj1.toString());

    }
}