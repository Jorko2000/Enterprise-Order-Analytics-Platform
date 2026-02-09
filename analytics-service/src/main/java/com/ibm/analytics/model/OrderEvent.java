package com.ibm.analytics.model;

import java.math.BigDecimal;
import java.util.UUID;

public class OrderEvent {

    private UUID orderId;
    private String product;
    private int quantity;
    private BigDecimal price;

    public UUID getOrderId() { return orderId; }
    public void setOrderId(UUID orderId) { this.orderId = orderId; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
}
