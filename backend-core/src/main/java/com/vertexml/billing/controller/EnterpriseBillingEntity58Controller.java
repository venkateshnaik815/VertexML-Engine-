package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity58;
import com.vertexml.billing.service.EnterpriseBillingEntity58Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/58")
public class EnterpriseBillingEntity58Controller {
    private final EnterpriseBillingEntity58Service service;
    public EnterpriseBillingEntity58Controller(EnterpriseBillingEntity58Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity58> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity58 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity58 create(@RequestBody EnterpriseBillingEntity58 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity58 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity58 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
