package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity44;
import com.vertexml.billing.service.EnterpriseBillingEntity44Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/44")
public class EnterpriseBillingEntity44Controller {
    private final EnterpriseBillingEntity44Service service;
    public EnterpriseBillingEntity44Controller(EnterpriseBillingEntity44Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity44> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity44 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity44 create(@RequestBody EnterpriseBillingEntity44 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity44 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity44 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
