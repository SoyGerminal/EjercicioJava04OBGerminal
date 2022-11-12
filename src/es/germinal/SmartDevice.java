package es.germinal;

public class SmartDevice {

    String brand;
    String model;
    String Os;
    double weight;
    double height;
    double width;
    double thickness;
    String backColor;

    public SmartDevice(){}

    public SmartDevice(String brand, String model, String os, double weight, double height, double width, double thickness, String backColor) {
        this.brand = brand;
        this.model = model;
        this.Os = os;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.backColor = backColor;
    }
}
