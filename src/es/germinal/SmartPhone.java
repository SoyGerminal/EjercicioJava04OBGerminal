package es.germinal;

public class SmartPhone extends SmartDevice {

    String screenType;
    boolean HighEnd;

    public SmartPhone() {}

    public SmartPhone(String brand, String model, String os, double weight, double height, double width, double thickness, String backColor, String screenType, boolean highEnd) {
        super(brand, model, os, weight, height, width, thickness, backColor);
        this.screenType = screenType;
        this.HighEnd = highEnd;
    }
}
