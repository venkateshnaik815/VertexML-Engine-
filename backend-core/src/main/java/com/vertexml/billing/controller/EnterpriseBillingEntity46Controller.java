package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity46;
import com.vertexml.billing.service.EnterpriseBillingEntity46Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/46")
public class EnterpriseBillingEntity46Controller {
    private final EnterpriseBillingEntity46Service service;
    public EnterpriseBillingEntity46Controller(EnterpriseBillingEntity46Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity46> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity46 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity46 create(@RequestBody EnterpriseBillingEntity46 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity46 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity46 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
