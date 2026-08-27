package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity77;
import com.vertexml.billing.service.EnterpriseBillingEntity77Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/77")
public class EnterpriseBillingEntity77Controller {
    private final EnterpriseBillingEntity77Service service;
    public EnterpriseBillingEntity77Controller(EnterpriseBillingEntity77Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity77> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity77 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity77 create(@RequestBody EnterpriseBillingEntity77 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity77 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity77 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
