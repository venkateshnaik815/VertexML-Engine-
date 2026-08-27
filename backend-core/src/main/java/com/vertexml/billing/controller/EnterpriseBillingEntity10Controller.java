package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity10;
import com.vertexml.billing.service.EnterpriseBillingEntity10Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/10")
public class EnterpriseBillingEntity10Controller {
    private final EnterpriseBillingEntity10Service service;
    public EnterpriseBillingEntity10Controller(EnterpriseBillingEntity10Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity10> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity10 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity10 create(@RequestBody EnterpriseBillingEntity10 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity10 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity10 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
