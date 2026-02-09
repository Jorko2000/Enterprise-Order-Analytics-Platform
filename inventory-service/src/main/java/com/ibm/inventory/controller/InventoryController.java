package com.ibm.inventory.controller;

import com.ibm.inventory.domain.InventoryItem;
import com.ibm.inventory.service.InventoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @PutMapping("/{id}")
    public InventoryItem update(@PathVariable Long id, @RequestParam int delta) {
        return service.updateStock(id, delta);
    }
}
