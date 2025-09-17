import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, FileNotFoundException {

        try {
            fileWriter();
        } catch (IOException e) {
            // Do nothing
        }


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Какая вам нужна мебель?");
//        System.out.println("Выберите вариант: ");
//        System.out.println("1. shoesCommode");
//        System.out.println("2. clothesCommode");
//
//        int choice = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Какие свойства должны быть у комода?");
//        System.out.println("1 height");
//        System.out.println("2 width");
//        System.out.println("3 color");
//        System.out.println("Введите номер свойств через пробел: ");
//
//        String propertiesInput = scanner.nextLine();
//        String[] properties = propertiesInput.split(" ");
//
//        String furniture;
//        String typeName;
//        String shoesCommode= "shoesCommode";
//        String clothesCommode= "clothesCommode";
//
//        if (choice == 1) {
//            typeName = "shoesCommode";
//        } else {
//            typeName = "clothesCommode";
//        }
//
//        System.out.println("Создан объект: " + typeName);
//        System.out.println("Свойства объекта:");
//
//        for (String prop : properties) {
//            switch (prop) {
//                case "1":
//                    System.out.println("- height = 8,1");
//                    break;
//                case "2":
//                    System.out.println("- width = 6,5");
///                    break;
//                case "3":
//                    System.out.println("- color = white");
//                    break;
//            }
//        }


//        Commode oldCommode = new Commode();
//
//        oldCommode.material = "Wooden";
//        oldCommode.color = "Brown";
//        oldCommode.content = "Clothes";
//
//        oldCommode.setCommodeDimensions(0.9, 0.4, 0.8, 2.8);
//
//        Clothes dress = new Clothes();
//        dress.types = "Skirts";
//        dress.number = 4;
//        oldCommode.putInClothes(dress);
//
//
//        Commode newTable = new Commode();
//        newTable.material = "MayBeWooden";
//        newTable.color = "White";
//        newTable.height = 0.75;
//        newTable.length = 1.1;
//        newTable.width = 0.5;
//
//        System.out.println(oldCommode.getObjectInfo());
//
//    }
//    public static void MyInfo() {
//        MyInfo randomInfo = new MyInfo();
//        randomInfo.getObjectInfo();
//
//        System.out.println(randomInfo.getObjectInfo());


        File commodeFromFile = new File("D:\\newTestFile2.txt\\");
        Scanner scanner = new Scanner(commodeFromFile);
        String commodeType;
        String color;
        double height;
        double width;

        ArrayList<Commode> commodes = new ArrayList<>();

        while (scanner.hasNext()) {
            commodeType = scanner.nextLine();
            color = scanner.nextLine();
            height = Double.parseDouble(scanner.nextLine());
            width = Integer.parseInt(scanner.nextLine());

            commodes.add(new Commode());

            commodes.forEach(System.out::println);

        }
    }

    private static void fileWriter() throws IOException {
        FileWriter commode = new FileWriter("D:\\newTestFile2.txt\\", false);
        commode.write("commodeType = clothesCommode\n");
        commode.write("height = 8.1\n");
        commode.write("width = 7\n");
        commode.write("color = white\n");
        try {
            commode.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
