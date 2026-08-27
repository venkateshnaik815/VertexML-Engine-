package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity104;
import com.vertexml.billing.service.EnterpriseBillingEntity104Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/104")
public class EnterpriseBillingEntity104Controller {
    private final EnterpriseBillingEntity104Service service;
    public EnterpriseBillingEntity104Controller(EnterpriseBillingEntity104Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity104> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity104 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity104 create(@RequestBody EnterpriseBillingEntity104 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity104 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity104 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
