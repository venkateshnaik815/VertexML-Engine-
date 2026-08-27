package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity84;
import com.vertexml.billing.service.EnterpriseBillingEntity84Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/84")
public class EnterpriseBillingEntity84Controller {
    private final EnterpriseBillingEntity84Service service;
    public EnterpriseBillingEntity84Controller(EnterpriseBillingEntity84Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity84> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity84 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity84 create(@RequestBody EnterpriseBillingEntity84 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity84 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity84 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
