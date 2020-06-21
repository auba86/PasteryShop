package warehouseService;

import model.Pastery;

import java.util.List;

public class WarehouseService extends Pastery {

    public void addNewProduct(List<Pastery> products, Pastery product) {
        products.add(product);
    }

    public void displayProductList(List<Pastery> productList) {
        for (Pastery pastery : productList) {
            System.out.println(pastery);
        }
    }

    public void updateProductList(List<Pastery> products, String tempProductName, int quantityValue){
        if(products.contains(tempProductName)) {
            setQuantity(quantityValue);
        }
    }
}
