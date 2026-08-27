package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity99;
import com.vertexml.billing.service.EnterpriseBillingEntity99Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/99")
public class EnterpriseBillingEntity99Controller {
    private final EnterpriseBillingEntity99Service service;
    public EnterpriseBillingEntity99Controller(EnterpriseBillingEntity99Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity99> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity99 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity99 create(@RequestBody EnterpriseBillingEntity99 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity99 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity99 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
