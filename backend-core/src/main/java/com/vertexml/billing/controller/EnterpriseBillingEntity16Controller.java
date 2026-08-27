package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity16;
import com.vertexml.billing.service.EnterpriseBillingEntity16Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/16")
public class EnterpriseBillingEntity16Controller {
    private final EnterpriseBillingEntity16Service service;
    public EnterpriseBillingEntity16Controller(EnterpriseBillingEntity16Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity16> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity16 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity16 create(@RequestBody EnterpriseBillingEntity16 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity16 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity16 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
