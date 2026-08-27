package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity38;
import com.vertexml.billing.service.EnterpriseBillingEntity38Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/38")
public class EnterpriseBillingEntity38Controller {
    private final EnterpriseBillingEntity38Service service;
    public EnterpriseBillingEntity38Controller(EnterpriseBillingEntity38Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity38> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity38 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity38 create(@RequestBody EnterpriseBillingEntity38 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity38 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity38 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
