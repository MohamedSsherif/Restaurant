package Models;

import java.util.ArrayList;

public class Menu {
   private final ArrayList<Food> deserts;
   private final ArrayList<Food> dinner;

    public Menu(){
        deserts = new ArrayList<>() {
            {
                add(new Food("1- Waffle", 15, 50));
                add(new Food("2- Cake", 30, 50));
                add(new Food("3- ice cream", 10, 50));

            }
        };

        dinner = new ArrayList<>() {
            {
                add(new Food("1- pasta", 15, 50));
                add(new Food("2- soup", 30, 50));
                add(new Food("3- pizza", 45, 50));
                add(new Food("4- meat", 100, 50));


            }
        };

    }

    public ArrayList<Food> getDeserts() {
        return deserts;
    }

    public ArrayList<Food> getDinner() {
        return dinner;
    }

//    public void setDeserts(String[] deserts) {
//        this.deserts = deserts;
//    }
//
//    public String[] getDinner() {
//        return dinner;
//    }
//
//    public void setDinner(String[] dinner) {
//        this.dinner = dinner;
//    }
}
