import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Products> prod = new ArrayList<>();
        ArrayList<Categories> categ = new ArrayList<>();

        categ.add(new Categories("AGD"));
        categ.add(new Categories("Fruits"));
        categ.add(new Categories("Alcohol"));

        prod.add(new Products(categ.get(0)));
        System.out.println(prod.get(0).getKat().getName());


    }
}
