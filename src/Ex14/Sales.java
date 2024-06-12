package Ex14;

import java.util.ArrayList;
import java.util.List;

public class Sales {
    private List<SLI> lines =  new ArrayList<>();

    public void createSalesLineItem(ProductDescription desc, int quantity) {
        SLI sli = desc.createSLI(quantity);
        lines.add(sli);
    }
}
