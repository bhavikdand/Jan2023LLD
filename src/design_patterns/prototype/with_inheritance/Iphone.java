package design_patterns.prototype.with_inheritance;

public class Iphone implements Prototype<Iphone> {
    private float height;
    private float width;
    private float weight;
    private String imei;
    private String color;

    public Iphone() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Iphone clone() {
        Iphone clone = new Iphone();
        clone.height = height;
        clone.width = width;
        clone.weight = weight;
        clone.imei = imei;
        clone.color = color;
        return clone;
    }
}
