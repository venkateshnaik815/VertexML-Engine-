package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity93;
import com.vertexml.billing.service.EnterpriseBillingEntity93Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/93")
public class EnterpriseBillingEntity93Controller {
    private final EnterpriseBillingEntity93Service service;
    public EnterpriseBillingEntity93Controller(EnterpriseBillingEntity93Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity93> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity93 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity93 create(@RequestBody EnterpriseBillingEntity93 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity93 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity93 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
