
public class DinnerMenu {

    public String dinner = "";

    public String canMake(int milkAmount, int powderAmount, int eggsCount, int sugarAmount,
        int oilAmount, int appleCount) {
        // Example

         if (appleCount >= 5) {
             // apples - 5
        dinner += "Apple juice ";}

         if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount  >= 30){
             // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml

             dinner += "Pancakes ";
         }
         if (powderAmount >= 5 && eggsCount >= 5 && milkAmount >= 300) {

            dinner += "Omelette ";

         }
        if (powderAmount >= 300 && eggsCount >= 4 && appleCount >= 3 && milkAmount >= 100) {
            // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4

            dinner += "Apple pie ";
        }

            return dinner; }}


