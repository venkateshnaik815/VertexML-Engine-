package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity110;
import com.vertexml.billing.service.EnterpriseBillingEntity110Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/110")
public class EnterpriseBillingEntity110Controller {
    private final EnterpriseBillingEntity110Service service;
    public EnterpriseBillingEntity110Controller(EnterpriseBillingEntity110Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity110> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity110 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity110 create(@RequestBody EnterpriseBillingEntity110 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity110 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity110 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
