package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity137;
import com.vertexml.billing.service.EnterpriseBillingEntity137Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/137")
public class EnterpriseBillingEntity137Controller {
    private final EnterpriseBillingEntity137Service service;
    public EnterpriseBillingEntity137Controller(EnterpriseBillingEntity137Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity137> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity137 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity137 create(@RequestBody EnterpriseBillingEntity137 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity137 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity137 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
