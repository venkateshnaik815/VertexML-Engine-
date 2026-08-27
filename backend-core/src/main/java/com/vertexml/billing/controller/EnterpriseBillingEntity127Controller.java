package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity127;
import com.vertexml.billing.service.EnterpriseBillingEntity127Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/127")
public class EnterpriseBillingEntity127Controller {
    private final EnterpriseBillingEntity127Service service;
    public EnterpriseBillingEntity127Controller(EnterpriseBillingEntity127Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity127> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity127 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity127 create(@RequestBody EnterpriseBillingEntity127 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity127 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity127 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
