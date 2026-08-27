package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity18;
import com.vertexml.billing.service.EnterpriseBillingEntity18Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/18")
public class EnterpriseBillingEntity18Controller {
    private final EnterpriseBillingEntity18Service service;
    public EnterpriseBillingEntity18Controller(EnterpriseBillingEntity18Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity18> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity18 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity18 create(@RequestBody EnterpriseBillingEntity18 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity18 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity18 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
