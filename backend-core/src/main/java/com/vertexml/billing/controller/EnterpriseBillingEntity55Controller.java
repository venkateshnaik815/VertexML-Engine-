package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity55;
import com.vertexml.billing.service.EnterpriseBillingEntity55Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/55")
public class EnterpriseBillingEntity55Controller {
    private final EnterpriseBillingEntity55Service service;
    public EnterpriseBillingEntity55Controller(EnterpriseBillingEntity55Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity55> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity55 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity55 create(@RequestBody EnterpriseBillingEntity55 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity55 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity55 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
