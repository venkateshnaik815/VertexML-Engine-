package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity11;
import com.vertexml.billing.service.EnterpriseBillingEntity11Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/11")
public class EnterpriseBillingEntity11Controller {
    private final EnterpriseBillingEntity11Service service;
    public EnterpriseBillingEntity11Controller(EnterpriseBillingEntity11Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity11> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity11 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity11 create(@RequestBody EnterpriseBillingEntity11 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity11 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity11 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
