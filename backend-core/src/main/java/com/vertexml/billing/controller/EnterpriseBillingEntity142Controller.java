package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity142;
import com.vertexml.billing.service.EnterpriseBillingEntity142Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/142")
public class EnterpriseBillingEntity142Controller {
    private final EnterpriseBillingEntity142Service service;
    public EnterpriseBillingEntity142Controller(EnterpriseBillingEntity142Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity142> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity142 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity142 create(@RequestBody EnterpriseBillingEntity142 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity142 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity142 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
