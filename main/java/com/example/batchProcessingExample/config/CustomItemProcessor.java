package com.example.batchProcessingExample.config;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {
    @Override
    public Product process(Product item) throws Exception {
        int discountedPrr = Integer.parseInt(item.getDiscount());
        double originalPrice = Double.parseDouble(item.getPrice());
        double discount = (discountedPrr/100)*originalPrice;
        double finalPrice = originalPrice-discount;
        item.setDiscountedPrice(String.valueOf(finalPrice));
        return item;
    }
}
