package ua.lviv.iot.weapons.model;

public class Size {
    private double length;
    private double width;
    private double height;

    public Size(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Size{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
