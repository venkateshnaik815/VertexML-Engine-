package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity64;
import com.vertexml.billing.service.EnterpriseBillingEntity64Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/64")
public class EnterpriseBillingEntity64Controller {
    private final EnterpriseBillingEntity64Service service;
    public EnterpriseBillingEntity64Controller(EnterpriseBillingEntity64Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity64> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity64 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity64 create(@RequestBody EnterpriseBillingEntity64 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity64 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity64 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
