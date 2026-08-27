package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity147;
import com.vertexml.billing.service.EnterpriseBillingEntity147Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/147")
public class EnterpriseBillingEntity147Controller {
    private final EnterpriseBillingEntity147Service service;
    public EnterpriseBillingEntity147Controller(EnterpriseBillingEntity147Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity147> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity147 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity147 create(@RequestBody EnterpriseBillingEntity147 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity147 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity147 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
