package es.germinal;

public class SmartWatch extends SmartDevice {

    String strap;
    Boolean gender;

    public SmartWatch() {}

    public SmartWatch(String brand, String model, String os, double weight, double height, double width, double length, String backColor, String strap, Boolean gender) {
        super(brand, model, os, weight, height, width, length, backColor);
        this.strap = strap;
        this.gender = gender;
    }
}
