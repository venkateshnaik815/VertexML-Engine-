package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity66;
import com.vertexml.billing.service.EnterpriseBillingEntity66Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/66")
public class EnterpriseBillingEntity66Controller {
    private final EnterpriseBillingEntity66Service service;
    public EnterpriseBillingEntity66Controller(EnterpriseBillingEntity66Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity66> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity66 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity66 create(@RequestBody EnterpriseBillingEntity66 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity66 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity66 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
