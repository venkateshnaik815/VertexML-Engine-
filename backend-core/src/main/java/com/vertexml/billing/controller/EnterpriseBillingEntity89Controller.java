package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity89;
import com.vertexml.billing.service.EnterpriseBillingEntity89Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/89")
public class EnterpriseBillingEntity89Controller {
    private final EnterpriseBillingEntity89Service service;
    public EnterpriseBillingEntity89Controller(EnterpriseBillingEntity89Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity89> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity89 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity89 create(@RequestBody EnterpriseBillingEntity89 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity89 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity89 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
