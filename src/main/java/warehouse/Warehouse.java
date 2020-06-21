package warehouse;

import meniu.Meniu;
import model.Cake;
import model.Cupcake;
import model.Pastery;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    public static void main(String[] args) {

        Meniu meniu = new Meniu();

//        Cake cake = new Cake("Napoleonas", 10, true, 15, false);
//        Cupcake cupcake = new Cupcake("Saulės nubučiuotas", 50, false, 3, 0.15);
//
//        List<Pastery> allProductsList = new ArrayList<Pastery>();
//
//        allProductsList.add(cake);
//        allProductsList.add(cupcake);

//        for (Pastery pastery : allProductsList) {
//            System.out.println(pastery);
//        }
        meniu.mainMenu();


    }
}
