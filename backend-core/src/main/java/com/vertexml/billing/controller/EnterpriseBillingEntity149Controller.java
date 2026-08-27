package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity149;
import com.vertexml.billing.service.EnterpriseBillingEntity149Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/149")
public class EnterpriseBillingEntity149Controller {
    private final EnterpriseBillingEntity149Service service;
    public EnterpriseBillingEntity149Controller(EnterpriseBillingEntity149Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity149> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity149 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity149 create(@RequestBody EnterpriseBillingEntity149 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity149 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity149 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
