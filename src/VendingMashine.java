import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    private List<Product> products;

    public VendingMashine(List<Product> products) {

        this.products = products;
    }

    public VendingMashine() {
        this(new ArrayList<>());
    }
    public List <Product> getProductsByCost(double cost) {
        List<Product> res = new ArrayList<>();
        for (Product product: products
             ) {
            if (product.getCost() <= cost) {
                res.add(product);
            }
        }
        return res;
    }

    public void add (Product product) {
          products.add(product);
    }



}



