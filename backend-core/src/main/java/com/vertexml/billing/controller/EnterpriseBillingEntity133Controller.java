package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity133;
import com.vertexml.billing.service.EnterpriseBillingEntity133Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/133")
public class EnterpriseBillingEntity133Controller {
    private final EnterpriseBillingEntity133Service service;
    public EnterpriseBillingEntity133Controller(EnterpriseBillingEntity133Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity133> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity133 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity133 create(@RequestBody EnterpriseBillingEntity133 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity133 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity133 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
