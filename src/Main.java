import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Commode oldCommode = new Commode();

        oldCommode.material = "Wooden";
        oldCommode.color = "Brown";
        oldCommode.content = "Clothes";

        oldCommode.setCommodeDimensions(0.9, 0.4, 0.8, 2.8);

        Clothes dress = new Clothes();
        dress.types = "Skirts";
        dress.number = 4;
        oldCommode.putInClothes(dress);

        Commode newTable = new Commode();
        newTable.material = "MayBeWooden";
        newTable.color = "White";
        newTable.height = 0.75;
        newTable.length = 1.1;
        newTable.width = 0.5;

        System.out.println(oldCommode.getObjectInfo());

    }
    public static void MyInfo() {
        MyInfo randomInfo = new MyInfo();
        randomInfo.getObjectInfo();

        System.out.println(randomInfo.getObjectInfo());

    }

}
