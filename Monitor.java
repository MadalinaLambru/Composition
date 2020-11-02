package com.Madalina;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Reasolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Reasolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drwing pixel at " + x + "," + y + "," + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Reasolution getNativeResolution() {
        return nativeResolution;
    }
}
