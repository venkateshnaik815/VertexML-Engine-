package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity92;
import com.vertexml.billing.service.EnterpriseBillingEntity92Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/92")
public class EnterpriseBillingEntity92Controller {
    private final EnterpriseBillingEntity92Service service;
    public EnterpriseBillingEntity92Controller(EnterpriseBillingEntity92Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity92> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity92 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity92 create(@RequestBody EnterpriseBillingEntity92 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity92 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity92 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
