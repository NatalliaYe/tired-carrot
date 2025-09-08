public class Commode {
    String material;
    String color;
    double height;
    double width;
    double length;
    double square;
    String content;
    Clothes information;


    public String getObjectInfo() {
        String content = getContent();
        return String.format("Commode material: %s\nCommode  color: %s\nCommode height: %s\nCommode square: %f",
                material, color, height, square);
    }

    public void putInClothes(Clothes newContent) {
        this.information.types = newContent.types;
        this.information.number = newContent.number;
    }

    public String getContent() {
        String Content = String.format("Content type: %s\nContent material: %s", content, information.types,
                information.number);
        return Content;
    }

    public void setCommodeDimensions(double height, double width, double length, double square) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.square = 2 * (height * width + length * height + length * width);
    }
}
