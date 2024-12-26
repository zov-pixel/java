
public class RecipeBook {

        public static final String MANUFACTURER = "RecipeBook Publisher";

        public static final String TITLE = "Книга рецептов";

        public CerealsAndLegumes cerealsAndLegume;

        public MeatAndFish meatAndFish;

        public MilkProducts milkProducts;

        public Spices spices;

        public VegetablesAndFruits vegetablesAndFruits;

        public RecipeBook(CerealsAndLegumes cerealsAndLegume, MeatAndFish meatAndFish, MilkProducts milkProducts, Spices spices, VegetablesAndFruits vegetablesAndFruits) {
                this.cerealsAndLegume = cerealsAndLegume;
                this.meatAndFish = meatAndFish;
                this.milkProducts = milkProducts;
                this.spices = spices;
                this.vegetablesAndFruits = vegetablesAndFruits;
        }
        public CerealsAndLegumes getCerealsAndLegume() {
                return cerealsAndLegume;
        }

        public void setCerealsAndLegume(CerealsAndLegumes cerealsAndLegume) {
                this.cerealsAndLegume = cerealsAndLegume;
        }

        public MeatAndFish getMeatAndFish() {
                return meatAndFish;
        }

        public void setMeatAndFish(MeatAndFish meatAndFish) {
                this.meatAndFish = meatAndFish;
        }

        public MilkProducts getMilkProducts() {
                return milkProducts;
        }

        public void setMilkProducts(MilkProducts milkProducts) {
                this.milkProducts = milkProducts;
        }

        public Spices getSpices() {
                return spices;
        }

        public void setSpices(Spices spices) {
                this.spices = spices;
        }

        public VegetablesAndFruits getVegetablesAndFruits() {
                return vegetablesAndFruits;
        }

        public void setVegetablesAndFruits(VegetablesAndFruits vegetablesAndFruits) {
                this.vegetablesAndFruits = vegetablesAndFruits;
        }
         public void clearCerealsAndLegumes(CerealsAndLegumes cerealsAndLegume){
                if(this.cerealsAndLegume == cerealsAndLegume){
                 this.cerealsAndLegume = null;
                }

        }
        public void clearMeatAndFish(MeatAndFish meatAndFish){
                if (this.meatAndFish == meatAndFish){
                this.meatAndFish = null;
                }

        }
        public void clearMilkProducts(MilkProducts milkProducts){
                if (this.milkProducts == milkProducts){
                        this.milkProducts = null;
                }

        }
        public void clearSpices(Spices spices){
                if (this.spices == spices){
                        this.spices = null;
                }

        }
        public void clearVegetablesAndFruits(VegetablesAndFruits vegetablesAndFruits){
                if (this.vegetablesAndFruits == vegetablesAndFruits){
                        this.vegetablesAndFruits = null;
                }

        }
         public void addNewCerealsAndLegumes(CerealsAndLegumes cerealsAndLegumes) {
                if (this.cerealsAndLegume == null) {
                 this.cerealsAndLegume = cerealsAndLegumes;
                }
        }

        public void addNewMeatAndFish(MeatAndFish meatAndFish) {
                if (this.meatAndFish == null) {
                        this.meatAndFish = meatAndFish;
                }
        }

        public void addNewMilkProducts(MilkProducts milkProducts) {
                if (this.milkProducts == null) {
                        this.milkProducts = milkProducts;
                }
        }

        public void addNewSpices(Spices spices) {
                if (this.spices == null) {
                        this.spices = spices;
                }
        }

        public void addNewVegetablesAndFruits(VegetablesAndFruits vegetablesAndFruits) {
                if (this.vegetablesAndFruits == null) {
                        this.vegetablesAndFruits = vegetablesAndFruits;
                }
        }

        public String toString() {

                return MANUFACTURER + "\n" + TITLE + "\n" + cerealsAndLegume + "\n" + meatAndFish+ "\n" + milkProducts + "\n" + spices + "\n" + vegetablesAndFruits + "\n";
        }
}



