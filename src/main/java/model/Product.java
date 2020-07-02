package model;

import javax.naming.Name;

public class Product {
    private String addToChartButton;
    private String size;
    private int price;

    public String getaddToChartButton() {
        return addToChartButton;
    }

    public void setaddToChartButton(String productTitle) {
        this.addToChartButton = productTitle;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setPrice(String price) {
        String priceAsText = price;
        this.price = Integer.valueOf(priceAsText);
    }
}
