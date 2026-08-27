package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity48;
import com.vertexml.billing.service.EnterpriseBillingEntity48Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/48")
public class EnterpriseBillingEntity48Controller {
    private final EnterpriseBillingEntity48Service service;
    public EnterpriseBillingEntity48Controller(EnterpriseBillingEntity48Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity48> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity48 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity48 create(@RequestBody EnterpriseBillingEntity48 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity48 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity48 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
