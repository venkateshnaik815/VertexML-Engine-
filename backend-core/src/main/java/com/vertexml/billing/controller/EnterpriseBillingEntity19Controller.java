package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity19;
import com.vertexml.billing.service.EnterpriseBillingEntity19Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/19")
public class EnterpriseBillingEntity19Controller {
    private final EnterpriseBillingEntity19Service service;
    public EnterpriseBillingEntity19Controller(EnterpriseBillingEntity19Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity19> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity19 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity19 create(@RequestBody EnterpriseBillingEntity19 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity19 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity19 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
