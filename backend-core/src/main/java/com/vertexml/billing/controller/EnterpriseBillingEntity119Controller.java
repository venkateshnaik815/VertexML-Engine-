package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity119;
import com.vertexml.billing.service.EnterpriseBillingEntity119Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/119")
public class EnterpriseBillingEntity119Controller {
    private final EnterpriseBillingEntity119Service service;
    public EnterpriseBillingEntity119Controller(EnterpriseBillingEntity119Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity119> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity119 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity119 create(@RequestBody EnterpriseBillingEntity119 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity119 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity119 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
