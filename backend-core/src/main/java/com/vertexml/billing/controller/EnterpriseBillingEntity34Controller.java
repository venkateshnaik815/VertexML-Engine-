package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity34;
import com.vertexml.billing.service.EnterpriseBillingEntity34Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/34")
public class EnterpriseBillingEntity34Controller {
    private final EnterpriseBillingEntity34Service service;
    public EnterpriseBillingEntity34Controller(EnterpriseBillingEntity34Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity34> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity34 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity34 create(@RequestBody EnterpriseBillingEntity34 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity34 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity34 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
