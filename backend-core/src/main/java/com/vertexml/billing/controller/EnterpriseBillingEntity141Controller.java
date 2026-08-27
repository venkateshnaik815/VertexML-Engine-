package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity141;
import com.vertexml.billing.service.EnterpriseBillingEntity141Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/141")
public class EnterpriseBillingEntity141Controller {
    private final EnterpriseBillingEntity141Service service;
    public EnterpriseBillingEntity141Controller(EnterpriseBillingEntity141Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity141> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity141 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity141 create(@RequestBody EnterpriseBillingEntity141 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity141 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity141 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
