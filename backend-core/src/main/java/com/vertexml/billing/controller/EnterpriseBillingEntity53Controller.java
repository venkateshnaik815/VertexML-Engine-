package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity53;
import com.vertexml.billing.service.EnterpriseBillingEntity53Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/53")
public class EnterpriseBillingEntity53Controller {
    private final EnterpriseBillingEntity53Service service;
    public EnterpriseBillingEntity53Controller(EnterpriseBillingEntity53Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity53> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity53 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity53 create(@RequestBody EnterpriseBillingEntity53 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity53 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity53 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
