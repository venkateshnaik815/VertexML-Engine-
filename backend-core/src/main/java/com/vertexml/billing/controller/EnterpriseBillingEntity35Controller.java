package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity35;
import com.vertexml.billing.service.EnterpriseBillingEntity35Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/35")
public class EnterpriseBillingEntity35Controller {
    private final EnterpriseBillingEntity35Service service;
    public EnterpriseBillingEntity35Controller(EnterpriseBillingEntity35Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity35> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity35 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity35 create(@RequestBody EnterpriseBillingEntity35 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity35 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity35 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
