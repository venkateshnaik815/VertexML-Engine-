package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity146;
import com.vertexml.billing.service.EnterpriseBillingEntity146Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/146")
public class EnterpriseBillingEntity146Controller {
    private final EnterpriseBillingEntity146Service service;
    public EnterpriseBillingEntity146Controller(EnterpriseBillingEntity146Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity146> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity146 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity146 create(@RequestBody EnterpriseBillingEntity146 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity146 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity146 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
