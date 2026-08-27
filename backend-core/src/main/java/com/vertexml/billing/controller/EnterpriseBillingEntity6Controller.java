package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity6;
import com.vertexml.billing.service.EnterpriseBillingEntity6Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/6")
public class EnterpriseBillingEntity6Controller {
    private final EnterpriseBillingEntity6Service service;
    public EnterpriseBillingEntity6Controller(EnterpriseBillingEntity6Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity6> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity6 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity6 create(@RequestBody EnterpriseBillingEntity6 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity6 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity6 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
