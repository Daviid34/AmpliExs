package Ex11;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        var beverage = new NutritionFacts.Builder(240, 4)
                .calories(2)
                .carbohydrates(19)
                .sodium(1)
                .build();
        System.out.println(beverage.getFat());
    }
}
