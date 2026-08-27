package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity54;
import com.vertexml.billing.service.EnterpriseBillingEntity54Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/54")
public class EnterpriseBillingEntity54Controller {
    private final EnterpriseBillingEntity54Service service;
    public EnterpriseBillingEntity54Controller(EnterpriseBillingEntity54Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity54> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity54 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity54 create(@RequestBody EnterpriseBillingEntity54 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity54 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity54 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
