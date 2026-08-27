package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity31;
import com.vertexml.billing.service.EnterpriseBillingEntity31Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/31")
public class EnterpriseBillingEntity31Controller {
    private final EnterpriseBillingEntity31Service service;
    public EnterpriseBillingEntity31Controller(EnterpriseBillingEntity31Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity31> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity31 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity31 create(@RequestBody EnterpriseBillingEntity31 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity31 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity31 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
