package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity91;
import com.vertexml.billing.service.EnterpriseBillingEntity91Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/91")
public class EnterpriseBillingEntity91Controller {
    private final EnterpriseBillingEntity91Service service;
    public EnterpriseBillingEntity91Controller(EnterpriseBillingEntity91Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity91> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity91 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity91 create(@RequestBody EnterpriseBillingEntity91 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity91 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity91 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
