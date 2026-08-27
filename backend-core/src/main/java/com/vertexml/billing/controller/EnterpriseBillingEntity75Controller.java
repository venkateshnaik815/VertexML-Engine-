package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity75;
import com.vertexml.billing.service.EnterpriseBillingEntity75Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/75")
public class EnterpriseBillingEntity75Controller {
    private final EnterpriseBillingEntity75Service service;
    public EnterpriseBillingEntity75Controller(EnterpriseBillingEntity75Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity75> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity75 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity75 create(@RequestBody EnterpriseBillingEntity75 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity75 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity75 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
