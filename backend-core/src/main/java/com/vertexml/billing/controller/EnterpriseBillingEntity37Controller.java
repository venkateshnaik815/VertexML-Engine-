package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity37;
import com.vertexml.billing.service.EnterpriseBillingEntity37Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/37")
public class EnterpriseBillingEntity37Controller {
    private final EnterpriseBillingEntity37Service service;
    public EnterpriseBillingEntity37Controller(EnterpriseBillingEntity37Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity37> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity37 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity37 create(@RequestBody EnterpriseBillingEntity37 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity37 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity37 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
