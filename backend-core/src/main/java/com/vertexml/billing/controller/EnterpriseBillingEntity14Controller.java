package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity14;
import com.vertexml.billing.service.EnterpriseBillingEntity14Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/14")
public class EnterpriseBillingEntity14Controller {
    private final EnterpriseBillingEntity14Service service;
    public EnterpriseBillingEntity14Controller(EnterpriseBillingEntity14Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity14> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity14 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity14 create(@RequestBody EnterpriseBillingEntity14 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity14 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity14 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
