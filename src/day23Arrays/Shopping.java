package day23Arrays;

public class Shopping {
    public static void main(String[] args) {
        String[] shoppingList = new String[7];

        shoppingList[0] = "Tpilet Paper";
        shoppingList[1] ="Hand Sanitizer";
        shoppingList[4] = "Eggs";
        shoppingList[6] = "Corona Beers";
        shoppingList[2] ="Bread";
        shoppingList[3] ="Milk";
        shoppingList[5] ="Water";

        for(int i=0; i<= shoppingList.length -1; i++){
            System.out.println(shoppingList[i]);

        }
    }
}
