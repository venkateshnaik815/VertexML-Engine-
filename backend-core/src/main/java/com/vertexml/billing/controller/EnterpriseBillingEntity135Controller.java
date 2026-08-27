package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity135;
import com.vertexml.billing.service.EnterpriseBillingEntity135Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/135")
public class EnterpriseBillingEntity135Controller {
    private final EnterpriseBillingEntity135Service service;
    public EnterpriseBillingEntity135Controller(EnterpriseBillingEntity135Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity135> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity135 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity135 create(@RequestBody EnterpriseBillingEntity135 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity135 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity135 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
