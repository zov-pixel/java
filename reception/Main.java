

public class Main {

    public static void main(String[] args) {
        CerealsAndLegumes cerealForOneRecipe = new CerealsAndLegumes("barley", TypeCerealsAndLegumes.WHOLEGRAIN, 500.0, 365);
        CerealsAndLegumes cerealForTwoRecipe = new CerealsAndLegumes("buckwheat", TypeCerealsAndLegumes.CORE, 1000.0, 730);
        MeatAndFish meatAndFishForOneRecipe = new MeatAndFish(NameMeatAndFish.BEEF, "fillet", 500, 1);
        MeatAndFish meatAndFishForTwoRecipe = new MeatAndFish(NameMeatAndFish.FISH, "fillet", 500, 1);
        MilkProducts milkProductsForOneRecipe = new MilkProducts("cheese", 50, 500, 10);
        MilkProducts milkProductsForTwoRecipe = new MilkProducts("milk", 3.2, 200, 3);
        Spices spicesForOneRecipe = new Spices("salt", TypeSpices.SHALLOW, "salty", 10);
        Spices spicesForTwoRecipe = new Spices("pepper", TypeSpices.GROUND, "bitter", 5);
        VegetablesAndFruits vegetablesAndFruitsForOneRecipe = new VegetablesAndFruits("tomato",TypeVegetablesAndFruits.VEGETABLE, 50, 200, 5);
        VegetablesAndFruits vegetablesAndFruitsForTwoRecipe = new VegetablesAndFruits("orange", TypeVegetablesAndFruits.FRUIT, 20, 100, 30);
        RecipeBook recipeBookOne = new RecipeBook(cerealForOneRecipe, meatAndFishForOneRecipe, milkProductsForOneRecipe, spicesForOneRecipe, vegetablesAndFruitsForOneRecipe);
        System.out.println(recipeBookOne);
        RecipeBook recipeBookTwo = new RecipeBook(cerealForTwoRecipe, meatAndFishForTwoRecipe, milkProductsForTwoRecipe, spicesForTwoRecipe, vegetablesAndFruitsForTwoRecipe);
        System.out.println(recipeBookTwo);
    }
}

