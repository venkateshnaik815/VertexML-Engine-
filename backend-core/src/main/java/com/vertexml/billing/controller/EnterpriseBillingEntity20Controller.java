package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity20;
import com.vertexml.billing.service.EnterpriseBillingEntity20Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/20")
public class EnterpriseBillingEntity20Controller {
    private final EnterpriseBillingEntity20Service service;
    public EnterpriseBillingEntity20Controller(EnterpriseBillingEntity20Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity20> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity20 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity20 create(@RequestBody EnterpriseBillingEntity20 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity20 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity20 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
