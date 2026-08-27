package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity33;
import com.vertexml.billing.service.EnterpriseBillingEntity33Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/33")
public class EnterpriseBillingEntity33Controller {
    private final EnterpriseBillingEntity33Service service;
    public EnterpriseBillingEntity33Controller(EnterpriseBillingEntity33Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity33> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity33 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity33 create(@RequestBody EnterpriseBillingEntity33 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity33 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity33 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
