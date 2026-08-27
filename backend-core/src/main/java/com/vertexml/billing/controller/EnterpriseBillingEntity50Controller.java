package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity50;
import com.vertexml.billing.service.EnterpriseBillingEntity50Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/50")
public class EnterpriseBillingEntity50Controller {
    private final EnterpriseBillingEntity50Service service;
    public EnterpriseBillingEntity50Controller(EnterpriseBillingEntity50Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity50> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity50 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity50 create(@RequestBody EnterpriseBillingEntity50 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity50 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity50 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
