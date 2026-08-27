package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity101;
import com.vertexml.billing.service.EnterpriseBillingEntity101Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/101")
public class EnterpriseBillingEntity101Controller {
    private final EnterpriseBillingEntity101Service service;
    public EnterpriseBillingEntity101Controller(EnterpriseBillingEntity101Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity101> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity101 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity101 create(@RequestBody EnterpriseBillingEntity101 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity101 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity101 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
