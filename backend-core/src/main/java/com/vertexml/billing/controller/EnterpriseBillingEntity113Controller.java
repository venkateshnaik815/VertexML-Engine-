package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity113;
import com.vertexml.billing.service.EnterpriseBillingEntity113Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/113")
public class EnterpriseBillingEntity113Controller {
    private final EnterpriseBillingEntity113Service service;
    public EnterpriseBillingEntity113Controller(EnterpriseBillingEntity113Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity113> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity113 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity113 create(@RequestBody EnterpriseBillingEntity113 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity113 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity113 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
