package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity124;
import com.vertexml.billing.service.EnterpriseBillingEntity124Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/124")
public class EnterpriseBillingEntity124Controller {
    private final EnterpriseBillingEntity124Service service;
    public EnterpriseBillingEntity124Controller(EnterpriseBillingEntity124Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity124> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity124 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity124 create(@RequestBody EnterpriseBillingEntity124 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity124 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity124 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
