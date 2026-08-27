package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity82;
import com.vertexml.billing.service.EnterpriseBillingEntity82Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/82")
public class EnterpriseBillingEntity82Controller {
    private final EnterpriseBillingEntity82Service service;
    public EnterpriseBillingEntity82Controller(EnterpriseBillingEntity82Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity82> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity82 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity82 create(@RequestBody EnterpriseBillingEntity82 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity82 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity82 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
