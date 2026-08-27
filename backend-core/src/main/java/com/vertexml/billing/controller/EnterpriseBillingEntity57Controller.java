package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity57;
import com.vertexml.billing.service.EnterpriseBillingEntity57Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/57")
public class EnterpriseBillingEntity57Controller {
    private final EnterpriseBillingEntity57Service service;
    public EnterpriseBillingEntity57Controller(EnterpriseBillingEntity57Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity57> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity57 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity57 create(@RequestBody EnterpriseBillingEntity57 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity57 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity57 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
