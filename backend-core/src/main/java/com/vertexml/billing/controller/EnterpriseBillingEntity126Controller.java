package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity126;
import com.vertexml.billing.service.EnterpriseBillingEntity126Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/126")
public class EnterpriseBillingEntity126Controller {
    private final EnterpriseBillingEntity126Service service;
    public EnterpriseBillingEntity126Controller(EnterpriseBillingEntity126Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity126> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity126 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity126 create(@RequestBody EnterpriseBillingEntity126 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity126 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity126 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
