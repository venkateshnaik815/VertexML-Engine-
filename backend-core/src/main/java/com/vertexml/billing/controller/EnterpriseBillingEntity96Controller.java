package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity96;
import com.vertexml.billing.service.EnterpriseBillingEntity96Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/96")
public class EnterpriseBillingEntity96Controller {
    private final EnterpriseBillingEntity96Service service;
    public EnterpriseBillingEntity96Controller(EnterpriseBillingEntity96Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity96> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity96 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity96 create(@RequestBody EnterpriseBillingEntity96 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity96 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity96 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
