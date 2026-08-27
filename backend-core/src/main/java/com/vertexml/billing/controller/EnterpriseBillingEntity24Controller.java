package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity24;
import com.vertexml.billing.service.EnterpriseBillingEntity24Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/24")
public class EnterpriseBillingEntity24Controller {
    private final EnterpriseBillingEntity24Service service;
    public EnterpriseBillingEntity24Controller(EnterpriseBillingEntity24Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity24> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity24 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity24 create(@RequestBody EnterpriseBillingEntity24 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity24 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity24 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
