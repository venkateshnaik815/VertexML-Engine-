package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity61;
import com.vertexml.billing.service.EnterpriseBillingEntity61Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/61")
public class EnterpriseBillingEntity61Controller {
    private final EnterpriseBillingEntity61Service service;
    public EnterpriseBillingEntity61Controller(EnterpriseBillingEntity61Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity61> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity61 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity61 create(@RequestBody EnterpriseBillingEntity61 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity61 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity61 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
