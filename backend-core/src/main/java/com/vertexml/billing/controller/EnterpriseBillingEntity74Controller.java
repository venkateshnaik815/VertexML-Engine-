package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity74;
import com.vertexml.billing.service.EnterpriseBillingEntity74Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/74")
public class EnterpriseBillingEntity74Controller {
    private final EnterpriseBillingEntity74Service service;
    public EnterpriseBillingEntity74Controller(EnterpriseBillingEntity74Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity74> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity74 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity74 create(@RequestBody EnterpriseBillingEntity74 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity74 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity74 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
