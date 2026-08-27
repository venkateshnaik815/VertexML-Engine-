package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity80;
import com.vertexml.billing.service.EnterpriseBillingEntity80Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/80")
public class EnterpriseBillingEntity80Controller {
    private final EnterpriseBillingEntity80Service service;
    public EnterpriseBillingEntity80Controller(EnterpriseBillingEntity80Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity80> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity80 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity80 create(@RequestBody EnterpriseBillingEntity80 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity80 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity80 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
