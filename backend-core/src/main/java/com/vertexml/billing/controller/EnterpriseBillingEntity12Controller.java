package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity12;
import com.vertexml.billing.service.EnterpriseBillingEntity12Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/12")
public class EnterpriseBillingEntity12Controller {
    private final EnterpriseBillingEntity12Service service;
    public EnterpriseBillingEntity12Controller(EnterpriseBillingEntity12Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity12> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity12 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity12 create(@RequestBody EnterpriseBillingEntity12 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity12 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity12 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
