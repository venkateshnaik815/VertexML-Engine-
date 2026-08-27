package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity47;
import com.vertexml.billing.service.EnterpriseBillingEntity47Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/47")
public class EnterpriseBillingEntity47Controller {
    private final EnterpriseBillingEntity47Service service;
    public EnterpriseBillingEntity47Controller(EnterpriseBillingEntity47Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity47> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity47 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity47 create(@RequestBody EnterpriseBillingEntity47 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity47 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity47 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
