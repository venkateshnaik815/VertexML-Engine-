package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity43;
import com.vertexml.billing.service.EnterpriseBillingEntity43Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/43")
public class EnterpriseBillingEntity43Controller {
    private final EnterpriseBillingEntity43Service service;
    public EnterpriseBillingEntity43Controller(EnterpriseBillingEntity43Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity43> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity43 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity43 create(@RequestBody EnterpriseBillingEntity43 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity43 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity43 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
