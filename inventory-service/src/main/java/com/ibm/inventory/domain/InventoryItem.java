package com.ibm.inventory.domain;

import jakarta.persistence.*;

@Entity
public class InventoryItem {

    @Id
    @GeneratedValue
    private Long id;

    private String product;

    private int availableQuantity;

    @Version
    private Long version;

    // getters and setters
}
