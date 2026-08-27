package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity73;
import com.vertexml.billing.service.EnterpriseBillingEntity73Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/73")
public class EnterpriseBillingEntity73Controller {
    private final EnterpriseBillingEntity73Service service;
    public EnterpriseBillingEntity73Controller(EnterpriseBillingEntity73Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity73> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity73 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity73 create(@RequestBody EnterpriseBillingEntity73 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity73 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity73 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
