package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity21;
import com.vertexml.billing.service.EnterpriseBillingEntity21Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/21")
public class EnterpriseBillingEntity21Controller {
    private final EnterpriseBillingEntity21Service service;
    public EnterpriseBillingEntity21Controller(EnterpriseBillingEntity21Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity21> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity21 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity21 create(@RequestBody EnterpriseBillingEntity21 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity21 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity21 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
