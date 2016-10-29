package com.brightworks.sg.ims.entities.model.order;

import javax.persistence.*;

/**
 * Created by kyel on 10/25/2016.
 */
@Entity
@Table(name = "CART_ITEMS")
public class CartItem {

    @Id
    private Long id;

    @Column
    private String sku;

    @Column
    private Long quantity;

    @Column
    private Double price;

    @ManyToOne
    private Cart cart;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
