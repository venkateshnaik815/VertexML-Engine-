package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity145;
import com.vertexml.billing.service.EnterpriseBillingEntity145Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/145")
public class EnterpriseBillingEntity145Controller {
    private final EnterpriseBillingEntity145Service service;
    public EnterpriseBillingEntity145Controller(EnterpriseBillingEntity145Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity145> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity145 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity145 create(@RequestBody EnterpriseBillingEntity145 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity145 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity145 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
