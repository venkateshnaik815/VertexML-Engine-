package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity94;
import com.vertexml.billing.service.EnterpriseBillingEntity94Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/94")
public class EnterpriseBillingEntity94Controller {
    private final EnterpriseBillingEntity94Service service;
    public EnterpriseBillingEntity94Controller(EnterpriseBillingEntity94Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity94> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity94 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity94 create(@RequestBody EnterpriseBillingEntity94 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity94 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity94 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
