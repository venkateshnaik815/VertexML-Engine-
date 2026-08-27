package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity4;
import com.vertexml.billing.service.EnterpriseBillingEntity4Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/4")
public class EnterpriseBillingEntity4Controller {
    private final EnterpriseBillingEntity4Service service;
    public EnterpriseBillingEntity4Controller(EnterpriseBillingEntity4Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity4> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity4 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity4 create(@RequestBody EnterpriseBillingEntity4 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity4 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity4 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
