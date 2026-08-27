package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity60;
import com.vertexml.billing.service.EnterpriseBillingEntity60Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/60")
public class EnterpriseBillingEntity60Controller {
    private final EnterpriseBillingEntity60Service service;
    public EnterpriseBillingEntity60Controller(EnterpriseBillingEntity60Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity60> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity60 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity60 create(@RequestBody EnterpriseBillingEntity60 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity60 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity60 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
