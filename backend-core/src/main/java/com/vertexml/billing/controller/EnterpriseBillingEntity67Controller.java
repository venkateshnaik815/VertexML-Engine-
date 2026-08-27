package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity67;
import com.vertexml.billing.service.EnterpriseBillingEntity67Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/67")
public class EnterpriseBillingEntity67Controller {
    private final EnterpriseBillingEntity67Service service;
    public EnterpriseBillingEntity67Controller(EnterpriseBillingEntity67Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity67> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity67 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity67 create(@RequestBody EnterpriseBillingEntity67 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity67 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity67 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
