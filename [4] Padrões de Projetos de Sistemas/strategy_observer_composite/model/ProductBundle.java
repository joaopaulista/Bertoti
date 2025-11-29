package model;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements IProductItem {
    private String bundleName;
    private List<IProductItem> items = new ArrayList<>();

    public ProductBundle(String bundleName) {
        this.bundleName = bundleName;
    }

    public void addItem(IProductItem item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (IProductItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String getName() {
        return bundleName + " (Contém " + items.size() + " itens)";
    }
}