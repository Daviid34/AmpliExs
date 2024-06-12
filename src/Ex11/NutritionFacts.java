package Ex11;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    public static class Builder {
        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories (int cal) {
            this.calories = cal;
            return this;
        }

        public Builder sodium(int sod){
            this.sodium = sod;
            return this;
        }
        public Builder carbohydrates(int carb){
            this.carbohydrate = carb;
            return this;
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts (Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
        this.fat = builder.fat;
    }
    public int getFat() {
        return carbohydrate;
    }
}
