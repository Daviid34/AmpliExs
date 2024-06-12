package Ex11;

public class NutritionBuilder {
    protected final int servingSize;
    protected final int servings;
    protected int calories = 0;
    protected int fat = 0;
    protected int sodium = 0;
    protected int carbohydrate = 0;
    public NutritionBuilder(int servingSize, int servings) {
        this.servingSize = servingSize;
        this.servings = servings;
    }
    public NutritionBuilder calories(int cal) {
        this.calories = cal;
        return this;
    }
    public NutritionBuilder sodium(int sod){
        this.sodium = sod;
        return this;
    }
    public NutritionBuilder carbohydrates(int carb){
        this.carbohydrate = carb;
        return this;
    }
    public NutritionFacts2 build() {
        return new NutritionFacts2(this);
    }
}
