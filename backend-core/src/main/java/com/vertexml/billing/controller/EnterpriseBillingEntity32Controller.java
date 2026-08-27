package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity32;
import com.vertexml.billing.service.EnterpriseBillingEntity32Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/32")
public class EnterpriseBillingEntity32Controller {
    private final EnterpriseBillingEntity32Service service;
    public EnterpriseBillingEntity32Controller(EnterpriseBillingEntity32Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity32> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity32 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity32 create(@RequestBody EnterpriseBillingEntity32 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity32 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity32 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
