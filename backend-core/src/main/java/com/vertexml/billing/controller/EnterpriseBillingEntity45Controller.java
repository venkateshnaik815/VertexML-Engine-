package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity45;
import com.vertexml.billing.service.EnterpriseBillingEntity45Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/45")
public class EnterpriseBillingEntity45Controller {
    private final EnterpriseBillingEntity45Service service;
    public EnterpriseBillingEntity45Controller(EnterpriseBillingEntity45Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity45> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity45 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity45 create(@RequestBody EnterpriseBillingEntity45 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity45 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity45 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
