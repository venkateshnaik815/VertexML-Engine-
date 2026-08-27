package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity103;
import com.vertexml.billing.service.EnterpriseBillingEntity103Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/103")
public class EnterpriseBillingEntity103Controller {
    private final EnterpriseBillingEntity103Service service;
    public EnterpriseBillingEntity103Controller(EnterpriseBillingEntity103Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity103> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity103 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity103 create(@RequestBody EnterpriseBillingEntity103 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity103 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity103 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
