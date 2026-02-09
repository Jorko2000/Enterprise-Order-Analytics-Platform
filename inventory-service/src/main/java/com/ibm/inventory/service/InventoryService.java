package com.ibm.inventory.service;

import com.ibm.inventory.domain.InventoryItem;
import com.ibm.inventory.repository.InventoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InventoryService {

    private final InventoryRepository repository;

    public InventoryService(InventoryRepository repository) {
        this.repository = repository;
    }

    public InventoryItem updateStock(Long id, int delta) {
        InventoryItem item = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Item not found"));
        item.setAvailableQuantity(item.getAvailableQuantity() + delta);
        return repository.save(item);
    }
}
