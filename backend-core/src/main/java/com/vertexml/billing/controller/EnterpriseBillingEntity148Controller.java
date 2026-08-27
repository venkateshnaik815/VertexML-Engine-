package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity148;
import com.vertexml.billing.service.EnterpriseBillingEntity148Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/148")
public class EnterpriseBillingEntity148Controller {
    private final EnterpriseBillingEntity148Service service;
    public EnterpriseBillingEntity148Controller(EnterpriseBillingEntity148Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity148> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity148 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity148 create(@RequestBody EnterpriseBillingEntity148 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity148 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity148 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
