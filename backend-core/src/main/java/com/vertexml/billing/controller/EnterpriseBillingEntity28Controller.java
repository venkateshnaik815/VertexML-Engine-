package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity28;
import com.vertexml.billing.service.EnterpriseBillingEntity28Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/28")
public class EnterpriseBillingEntity28Controller {
    private final EnterpriseBillingEntity28Service service;
    public EnterpriseBillingEntity28Controller(EnterpriseBillingEntity28Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity28> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity28 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity28 create(@RequestBody EnterpriseBillingEntity28 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity28 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity28 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
