package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity36;
import com.vertexml.billing.service.EnterpriseBillingEntity36Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/36")
public class EnterpriseBillingEntity36Controller {
    private final EnterpriseBillingEntity36Service service;
    public EnterpriseBillingEntity36Controller(EnterpriseBillingEntity36Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity36> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity36 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity36 create(@RequestBody EnterpriseBillingEntity36 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity36 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity36 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
