package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity108;
import com.vertexml.billing.service.EnterpriseBillingEntity108Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/108")
public class EnterpriseBillingEntity108Controller {
    private final EnterpriseBillingEntity108Service service;
    public EnterpriseBillingEntity108Controller(EnterpriseBillingEntity108Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity108> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity108 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity108 create(@RequestBody EnterpriseBillingEntity108 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity108 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity108 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
