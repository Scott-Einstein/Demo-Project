import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food(1,"pizza","Seafood",11,12));
        foods.add(new Food(2,"pizza","Beef",9,10));
        foods.add(new Food(3,"fried rice","Seafood",5,12));
        foods.add(new Food(4,"noodles","Beef",6,14));
        for (Food f:foods) {
            System.out.println(f);
        }


    }
}
