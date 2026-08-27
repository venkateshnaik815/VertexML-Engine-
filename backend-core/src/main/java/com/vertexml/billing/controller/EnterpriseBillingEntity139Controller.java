package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity139;
import com.vertexml.billing.service.EnterpriseBillingEntity139Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/139")
public class EnterpriseBillingEntity139Controller {
    private final EnterpriseBillingEntity139Service service;
    public EnterpriseBillingEntity139Controller(EnterpriseBillingEntity139Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity139> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity139 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity139 create(@RequestBody EnterpriseBillingEntity139 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity139 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity139 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
