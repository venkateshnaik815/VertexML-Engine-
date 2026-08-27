package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity15;
import com.vertexml.billing.service.EnterpriseBillingEntity15Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/15")
public class EnterpriseBillingEntity15Controller {
    private final EnterpriseBillingEntity15Service service;
    public EnterpriseBillingEntity15Controller(EnterpriseBillingEntity15Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity15> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity15 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity15 create(@RequestBody EnterpriseBillingEntity15 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity15 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity15 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
