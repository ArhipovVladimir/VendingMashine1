import java.util.List;

public class Main {
    public static void main(String[] args) {

        VendingMashine VendingMashine = new VendingMashine();
        VendingMashine.add(new Botlte("Coca-Cola", 90.0, 2));
        VendingMashine.add(new Product("Milko", 80.0));
        VendingMashine.add(new Product("Fanta", 99.0));


        List <Product> products = VendingMashine.getProductsByCost(100);
        System.out.println(products);
    }
}