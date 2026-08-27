package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity78;
import com.vertexml.billing.service.EnterpriseBillingEntity78Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/78")
public class EnterpriseBillingEntity78Controller {
    private final EnterpriseBillingEntity78Service service;
    public EnterpriseBillingEntity78Controller(EnterpriseBillingEntity78Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity78> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity78 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity78 create(@RequestBody EnterpriseBillingEntity78 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity78 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity78 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
