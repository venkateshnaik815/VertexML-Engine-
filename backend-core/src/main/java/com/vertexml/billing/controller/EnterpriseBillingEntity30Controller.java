package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity30;
import com.vertexml.billing.service.EnterpriseBillingEntity30Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/30")
public class EnterpriseBillingEntity30Controller {
    private final EnterpriseBillingEntity30Service service;
    public EnterpriseBillingEntity30Controller(EnterpriseBillingEntity30Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity30> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity30 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity30 create(@RequestBody EnterpriseBillingEntity30 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity30 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity30 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
