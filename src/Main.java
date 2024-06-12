import Ex11.NutritionBuilder;
import Ex11.NutritionFacts2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String linea = "Hola que tal";
        StringTokenizer st = new StringTokenizer(linea);
        NutritionBuilder nb = new NutritionBuilder(19, 10);
        NutritionFacts2 factos = nb.sodium(10).calories(10).build();
        System.out.println(factos.getServingSize());
        Ex1ObjectAdapter<Object> adapter = new Ex1ObjectAdapter<>(st);
    }
}