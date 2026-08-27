package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity95;
import com.vertexml.billing.service.EnterpriseBillingEntity95Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/95")
public class EnterpriseBillingEntity95Controller {
    private final EnterpriseBillingEntity95Service service;
    public EnterpriseBillingEntity95Controller(EnterpriseBillingEntity95Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity95> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity95 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity95 create(@RequestBody EnterpriseBillingEntity95 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity95 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity95 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
