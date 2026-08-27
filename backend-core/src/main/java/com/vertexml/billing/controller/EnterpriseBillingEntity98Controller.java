package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity98;
import com.vertexml.billing.service.EnterpriseBillingEntity98Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/98")
public class EnterpriseBillingEntity98Controller {
    private final EnterpriseBillingEntity98Service service;
    public EnterpriseBillingEntity98Controller(EnterpriseBillingEntity98Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity98> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity98 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity98 create(@RequestBody EnterpriseBillingEntity98 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity98 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity98 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
