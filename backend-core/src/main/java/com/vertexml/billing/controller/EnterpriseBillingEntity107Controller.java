package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity107;
import com.vertexml.billing.service.EnterpriseBillingEntity107Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/107")
public class EnterpriseBillingEntity107Controller {
    private final EnterpriseBillingEntity107Service service;
    public EnterpriseBillingEntity107Controller(EnterpriseBillingEntity107Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity107> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity107 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity107 create(@RequestBody EnterpriseBillingEntity107 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity107 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity107 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
