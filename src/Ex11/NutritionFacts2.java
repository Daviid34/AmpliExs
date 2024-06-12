package Ex11;

public class NutritionFacts2 {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    protected NutritionFacts2 (NutritionBuilder nb) {
        this.servingSize = nb.servingSize;
        this.servings = nb.servings;
        this.calories = nb.calories;
        this.fat = nb.fat;
        this.sodium = nb.sodium;
        this.carbohydrate = nb.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }
}
