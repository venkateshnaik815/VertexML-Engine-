package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity5;
import com.vertexml.billing.service.EnterpriseBillingEntity5Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/5")
public class EnterpriseBillingEntity5Controller {
    private final EnterpriseBillingEntity5Service service;
    public EnterpriseBillingEntity5Controller(EnterpriseBillingEntity5Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity5> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity5 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity5 create(@RequestBody EnterpriseBillingEntity5 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity5 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity5 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
