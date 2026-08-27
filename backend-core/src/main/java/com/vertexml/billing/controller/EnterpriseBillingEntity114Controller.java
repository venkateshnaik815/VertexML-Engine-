package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity114;
import com.vertexml.billing.service.EnterpriseBillingEntity114Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/114")
public class EnterpriseBillingEntity114Controller {
    private final EnterpriseBillingEntity114Service service;
    public EnterpriseBillingEntity114Controller(EnterpriseBillingEntity114Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity114> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity114 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity114 create(@RequestBody EnterpriseBillingEntity114 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity114 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity114 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
