package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity52;
import com.vertexml.billing.service.EnterpriseBillingEntity52Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/52")
public class EnterpriseBillingEntity52Controller {
    private final EnterpriseBillingEntity52Service service;
    public EnterpriseBillingEntity52Controller(EnterpriseBillingEntity52Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity52> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity52 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity52 create(@RequestBody EnterpriseBillingEntity52 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity52 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity52 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
