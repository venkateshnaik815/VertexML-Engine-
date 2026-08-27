package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity140;
import com.vertexml.billing.service.EnterpriseBillingEntity140Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/140")
public class EnterpriseBillingEntity140Controller {
    private final EnterpriseBillingEntity140Service service;
    public EnterpriseBillingEntity140Controller(EnterpriseBillingEntity140Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity140> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity140 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity140 create(@RequestBody EnterpriseBillingEntity140 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity140 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity140 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
