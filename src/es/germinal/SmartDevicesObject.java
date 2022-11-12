package es.germinal;

public class SmartDevicesObject {
    public static void main(String[] args) {

        // A continuación creamos un objeto SmartPhone.

        SmartPhone iphoneSe = new SmartPhone("Iphone","Se","IOs",144,138.40,67.30,7.43,"Green","Oled",false);
        System.out.println("Marca del Smartphone: " + iphoneSe.brand);
        System.out.println("Modelo del Smartphone: " + iphoneSe.model);
        System.out.println("Sistema operativo: " + iphoneSe.Os);
        System.out.println("Peso (en gramos) del Smartphone: " + iphoneSe.weight + " gramos");
        System.out.println("Altura (en milímetros del Smartphone: " + iphoneSe.height + " milímetros");
        System.out.println("Ancho (en milímetros) del Smartphone: " + iphoneSe.width + " milímetros");
        System.out.println("El espesor (en milímetros) del Smartphone: " + iphoneSe.thickness + " milímetros");
        System.out.println("El color trasero del Smartphone es: " +iphoneSe.backColor);
        System.out.println("EL tipo de pantalla del Smartphone es: " +iphoneSe.screenType);
        System.out.println("¿Es de alta gama?: " +iphoneSe.HighEnd);

        // A continuación creamos un objeto SmartWatch.
        System.out.println("//////// Línea de separacion entre objetos //////////////");

        SmartWatch appleWatch = new SmartWatch("AppleWatch","serie 7","WatchOS",42.4,45.0,38,10.7,"Azul","cuero",true);
        System.out.println("Marca del Smartwatch: " + appleWatch.brand);
        System.out.println("Modelo del Smartwatch: " + appleWatch.model);
        System.out.println("Sistema operativo: " + appleWatch.Os);
        System.out.println("Peso (en gramos) del Smartwatch: " + appleWatch.weight + " gramos.");
        System.out.println("Altura (en milímetros) del Smartwatch " + appleWatch.height + " milímetros");
        System.out.println("Ancho (en milímetros) del Smartwatch " + appleWatch.width + " milímetros");
        System.out.println("El espesor (en milímetros) del Smartwatch " + appleWatch.thickness + " milímetros");
        System.out.println("El color trasero del Smartwatch es: " + appleWatch.backColor);
        System.out.println("EL tipo de correa  del Smartwatch es: " + appleWatch.strap);
        System.out.println("¿Es un modelo femenino?: " +appleWatch.gender);

    }
}
