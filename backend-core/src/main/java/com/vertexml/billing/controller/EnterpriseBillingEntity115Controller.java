package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity115;
import com.vertexml.billing.service.EnterpriseBillingEntity115Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/115")
public class EnterpriseBillingEntity115Controller {
    private final EnterpriseBillingEntity115Service service;
    public EnterpriseBillingEntity115Controller(EnterpriseBillingEntity115Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity115> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity115 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity115 create(@RequestBody EnterpriseBillingEntity115 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity115 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity115 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
