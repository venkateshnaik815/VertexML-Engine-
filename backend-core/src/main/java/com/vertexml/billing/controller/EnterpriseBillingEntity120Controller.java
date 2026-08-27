package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity120;
import com.vertexml.billing.service.EnterpriseBillingEntity120Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/120")
public class EnterpriseBillingEntity120Controller {
    private final EnterpriseBillingEntity120Service service;
    public EnterpriseBillingEntity120Controller(EnterpriseBillingEntity120Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity120> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity120 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity120 create(@RequestBody EnterpriseBillingEntity120 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity120 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity120 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
