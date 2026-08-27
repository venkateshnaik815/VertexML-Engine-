package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity85;
import com.vertexml.billing.service.EnterpriseBillingEntity85Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/85")
public class EnterpriseBillingEntity85Controller {
    private final EnterpriseBillingEntity85Service service;
    public EnterpriseBillingEntity85Controller(EnterpriseBillingEntity85Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity85> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity85 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity85 create(@RequestBody EnterpriseBillingEntity85 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity85 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity85 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
