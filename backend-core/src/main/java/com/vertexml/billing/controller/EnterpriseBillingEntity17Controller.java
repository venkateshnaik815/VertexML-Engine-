package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity17;
import com.vertexml.billing.service.EnterpriseBillingEntity17Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/17")
public class EnterpriseBillingEntity17Controller {
    private final EnterpriseBillingEntity17Service service;
    public EnterpriseBillingEntity17Controller(EnterpriseBillingEntity17Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity17> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity17 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity17 create(@RequestBody EnterpriseBillingEntity17 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity17 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity17 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
