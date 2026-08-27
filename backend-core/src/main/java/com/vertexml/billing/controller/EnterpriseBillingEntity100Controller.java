package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity100;
import com.vertexml.billing.service.EnterpriseBillingEntity100Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/100")
public class EnterpriseBillingEntity100Controller {
    private final EnterpriseBillingEntity100Service service;
    public EnterpriseBillingEntity100Controller(EnterpriseBillingEntity100Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity100> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity100 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity100 create(@RequestBody EnterpriseBillingEntity100 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity100 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity100 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
