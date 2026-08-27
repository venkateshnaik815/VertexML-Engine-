package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity39;
import com.vertexml.billing.service.EnterpriseBillingEntity39Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/39")
public class EnterpriseBillingEntity39Controller {
    private final EnterpriseBillingEntity39Service service;
    public EnterpriseBillingEntity39Controller(EnterpriseBillingEntity39Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity39> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity39 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity39 create(@RequestBody EnterpriseBillingEntity39 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity39 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity39 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
