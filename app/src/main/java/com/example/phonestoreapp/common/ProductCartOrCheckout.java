package com.example.phonestoreapp.common;

import com.example.phonestoreapp.Model.Product;

public class ProductCartOrCheckout {
    public int quantity;

    public Product product;


    public ProductCartOrCheckout(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }


}
