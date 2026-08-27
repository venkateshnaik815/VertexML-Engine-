package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity83;
import com.vertexml.billing.service.EnterpriseBillingEntity83Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/83")
public class EnterpriseBillingEntity83Controller {
    private final EnterpriseBillingEntity83Service service;
    public EnterpriseBillingEntity83Controller(EnterpriseBillingEntity83Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity83> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity83 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity83 create(@RequestBody EnterpriseBillingEntity83 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity83 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity83 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
