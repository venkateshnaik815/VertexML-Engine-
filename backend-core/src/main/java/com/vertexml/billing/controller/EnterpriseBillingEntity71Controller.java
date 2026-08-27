package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity71;
import com.vertexml.billing.service.EnterpriseBillingEntity71Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/71")
public class EnterpriseBillingEntity71Controller {
    private final EnterpriseBillingEntity71Service service;
    public EnterpriseBillingEntity71Controller(EnterpriseBillingEntity71Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity71> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity71 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity71 create(@RequestBody EnterpriseBillingEntity71 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity71 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity71 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
