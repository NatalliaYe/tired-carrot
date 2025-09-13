import furniture.ClothesCommode;
import furniture.furniture;
import furniture.ShoesCommode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какая вам нужна мебель?");
        System.out.println("Выберите вариант: ");
        System.out.println("1. shoesCommode");
        System.out.println("2. clothesCommode");

        int choice = Integer.parseInt(scanner.nextLine());

        System.out.println("Какие свойства должны быть у комода?");
        System.out.println("1 height");
        System.out.println("2 width");
        System.out.println("3 color");
        System.out.println("Введите номер свойств через пробел: ");

        String propertiesInput = scanner.nextLine();
        String[] properties = propertiesInput.split(" ");

        furniture  furniture;
        String typeName;

        if (choice == 1) {
            furniture = new ShoesCommode();
            typeName = "shoesCommode";
        } else {
            furniture = new ClothesCommode();
            typeName = "clothesCommode";
        }

        System.out.println("Создан объект: " + typeName);
        System.out.println("Свойства объекта:");

        for (String prop : properties) {
            switch (prop) {
                case "1":
                    System.out.println("- height");
                    break;
                case "2":
                    System.out.println("- width");
                    break;
                case "3":
                    System.out.println("- color");
                    break;
            }
        }


//        ShoesCommode NewOne = new ShoesCommode();
//        NewOne.store("shoes");
//        NewOne.keepShoes();
//
//        ClothesCommode NewTwo = new ClothesCommode();
//        NewTwo.keepClothes();


    }
}