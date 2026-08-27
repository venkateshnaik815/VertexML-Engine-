package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity106;
import com.vertexml.billing.service.EnterpriseBillingEntity106Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/106")
public class EnterpriseBillingEntity106Controller {
    private final EnterpriseBillingEntity106Service service;
    public EnterpriseBillingEntity106Controller(EnterpriseBillingEntity106Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity106> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity106 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity106 create(@RequestBody EnterpriseBillingEntity106 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity106 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity106 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
