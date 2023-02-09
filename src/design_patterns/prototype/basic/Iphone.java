package design_patterns.prototype.basic;

public class Iphone implements Prototype<Iphone> {
    float height;
    float width;
    float weight;
    String imei;
    String color;

    public Iphone(float height, float width, float weight, String imei, String color) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.imei = imei;
        this.color = color;
    }

    @Override
    public Iphone clone() {
        return new Iphone(this.height, this.width, this.weight, this.imei, this.color);
    }
}
