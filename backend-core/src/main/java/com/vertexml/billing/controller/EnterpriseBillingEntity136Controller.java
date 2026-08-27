package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity136;
import com.vertexml.billing.service.EnterpriseBillingEntity136Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/136")
public class EnterpriseBillingEntity136Controller {
    private final EnterpriseBillingEntity136Service service;
    public EnterpriseBillingEntity136Controller(EnterpriseBillingEntity136Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity136> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity136 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity136 create(@RequestBody EnterpriseBillingEntity136 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity136 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity136 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
