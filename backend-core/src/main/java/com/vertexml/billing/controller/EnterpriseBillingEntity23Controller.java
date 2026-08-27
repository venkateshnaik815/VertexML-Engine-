package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity23;
import com.vertexml.billing.service.EnterpriseBillingEntity23Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/23")
public class EnterpriseBillingEntity23Controller {
    private final EnterpriseBillingEntity23Service service;
    public EnterpriseBillingEntity23Controller(EnterpriseBillingEntity23Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity23> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity23 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity23 create(@RequestBody EnterpriseBillingEntity23 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity23 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity23 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
