package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity97;
import com.vertexml.billing.service.EnterpriseBillingEntity97Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/97")
public class EnterpriseBillingEntity97Controller {
    private final EnterpriseBillingEntity97Service service;
    public EnterpriseBillingEntity97Controller(EnterpriseBillingEntity97Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity97> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity97 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity97 create(@RequestBody EnterpriseBillingEntity97 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity97 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity97 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
