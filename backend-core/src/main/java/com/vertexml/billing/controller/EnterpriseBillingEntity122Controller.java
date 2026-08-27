package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity122;
import com.vertexml.billing.service.EnterpriseBillingEntity122Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/122")
public class EnterpriseBillingEntity122Controller {
    private final EnterpriseBillingEntity122Service service;
    public EnterpriseBillingEntity122Controller(EnterpriseBillingEntity122Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity122> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity122 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity122 create(@RequestBody EnterpriseBillingEntity122 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity122 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity122 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
