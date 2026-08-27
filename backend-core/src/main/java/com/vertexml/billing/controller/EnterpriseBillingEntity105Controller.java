package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity105;
import com.vertexml.billing.service.EnterpriseBillingEntity105Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/105")
public class EnterpriseBillingEntity105Controller {
    private final EnterpriseBillingEntity105Service service;
    public EnterpriseBillingEntity105Controller(EnterpriseBillingEntity105Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity105> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity105 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity105 create(@RequestBody EnterpriseBillingEntity105 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity105 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity105 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
