package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity86;
import com.vertexml.billing.service.EnterpriseBillingEntity86Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/86")
public class EnterpriseBillingEntity86Controller {
    private final EnterpriseBillingEntity86Service service;
    public EnterpriseBillingEntity86Controller(EnterpriseBillingEntity86Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity86> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity86 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity86 create(@RequestBody EnterpriseBillingEntity86 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity86 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity86 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
