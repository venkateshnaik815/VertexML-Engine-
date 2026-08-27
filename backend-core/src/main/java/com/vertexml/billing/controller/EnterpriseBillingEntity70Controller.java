package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity70;
import com.vertexml.billing.service.EnterpriseBillingEntity70Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/70")
public class EnterpriseBillingEntity70Controller {
    private final EnterpriseBillingEntity70Service service;
    public EnterpriseBillingEntity70Controller(EnterpriseBillingEntity70Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity70> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity70 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity70 create(@RequestBody EnterpriseBillingEntity70 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity70 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity70 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
