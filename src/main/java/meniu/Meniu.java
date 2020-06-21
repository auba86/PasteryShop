package meniu;

import model.Cake;
import model.Cupcake;
import model.Pastery;
import warehouseService.WarehouseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Meniu extends Pastery {

    public static List<Pastery> allProductsList = new ArrayList<Pastery>();

    WarehouseService warehouseService = new WarehouseService();

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Add new product");
            System.out.println("2. Display product list");
            System.out.println("3. Update product list");
            System.out.println("4. Delete an item");
            System.out.println("5. Exit\n");

            System.out.println("Choose action (1-5): ");
            int menuChoise = scanner.nextInt();

            switch (menuChoise) {
                case 1:
                    System.out.println("Cake or cupcake? Cake - 1, Cupcake - 2");
                    int tempCakeOrCupcake = scanner.nextInt();
                    if(tempCakeOrCupcake == 1) {
                        addNewCake(scanner);
                    }
                    if(tempCakeOrCupcake == 2) {
                        addNewCupcake(scanner);
                    }
                    else {
                        mainMenu();
                    }


                    continue;
                case 2:
                    warehouseService.displayProductList(allProductsList);
                    continue;
                case 3:
                    warehouseService.displayProductList(allProductsList);
                    System.out.println("Which product quantity would you like to change? Enter product name: ");
                    String tempProductName = scanner.next();
                    scanner.nextLine();
                    System.out.println("Update product quantity: ");
                    int quantityValue = scanner.nextInt();
                    warehouseService.updateProductList(allProductsList, tempProductName, quantityValue);
                    continue;
                case 4:
                    //deleteAnItem();
                    continue;
                case 5:
                    break;
                default:
                    System.out.println("Please, restart the program");
            }
            break;

        }
    }

    private void addNewCupcake(Scanner scanner) {
        System.out.println("Enter product name: ");
        String tempProductName = scanner.next();
        scanner.nextLine();
        System.out.println("Product quantity: ");
        int tempProductQuantity = scanner.nextInt();
        System.out.println("Is vegan? Yes - 1, No - 2?");
        int veganChoise = scanner.nextInt();
        boolean tempIsVegan = isVegan(veganChoise);
        System.out.println("Product price: ");
        double tempProductPrice = scanner.nextDouble();
        System.out.println("Cupcake weight: ");
        double tempWeight = scanner.nextDouble();
        Cupcake newCupcake = new Cupcake(tempProductName, tempProductQuantity,tempIsVegan, tempProductPrice, tempWeight);
        warehouseService.addNewProduct(allProductsList, newCupcake);
    }

    private void addNewCake(Scanner scanner) {
        System.out.println("Enter product name: ");
        String tempProductName = scanner.next();
        scanner.nextLine();
        System.out.println("Product quantity: ");
        int tempProductQuantity = scanner.nextInt();
        System.out.println("Is vegan? Yes - 1, No - 2?");
        int veganChoice = scanner.nextInt();
        boolean tempIsVegan = isVegan(veganChoice);
        System.out.println("Product price: ");
        double tempProductPrice = scanner.nextDouble();
        System.out.println("Has candles? Yes - 1, No - 2?");
        int candlesChoice = scanner.nextInt();
        boolean tempHasCandles = hasCandles(candlesChoice);
        Cake newCake = new Cake(tempProductName, tempProductQuantity, tempIsVegan, tempProductPrice, tempHasCandles);
        warehouseService.addNewProduct(allProductsList, newCake);
    }

    private boolean hasCandles(int candlesChoice) {
        return candlesChoice == 1 ? true : false;
    }

    private boolean isVegan(int veganChoice) {
        return veganChoice == 1 ? true : false;
    }
}
