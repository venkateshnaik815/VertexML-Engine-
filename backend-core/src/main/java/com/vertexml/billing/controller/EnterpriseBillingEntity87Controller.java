package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity87;
import com.vertexml.billing.service.EnterpriseBillingEntity87Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/87")
public class EnterpriseBillingEntity87Controller {
    private final EnterpriseBillingEntity87Service service;
    public EnterpriseBillingEntity87Controller(EnterpriseBillingEntity87Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity87> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity87 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity87 create(@RequestBody EnterpriseBillingEntity87 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity87 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity87 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
