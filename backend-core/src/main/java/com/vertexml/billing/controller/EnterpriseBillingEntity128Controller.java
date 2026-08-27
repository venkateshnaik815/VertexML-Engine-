package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity128;
import com.vertexml.billing.service.EnterpriseBillingEntity128Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/128")
public class EnterpriseBillingEntity128Controller {
    private final EnterpriseBillingEntity128Service service;
    public EnterpriseBillingEntity128Controller(EnterpriseBillingEntity128Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity128> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity128 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity128 create(@RequestBody EnterpriseBillingEntity128 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity128 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity128 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
