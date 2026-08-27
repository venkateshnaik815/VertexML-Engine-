package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity1;
import com.vertexml.billing.service.EnterpriseBillingEntity1Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/1")
public class EnterpriseBillingEntity1Controller {
    private final EnterpriseBillingEntity1Service service;
    public EnterpriseBillingEntity1Controller(EnterpriseBillingEntity1Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity1> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity1 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity1 create(@RequestBody EnterpriseBillingEntity1 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity1 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity1 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
