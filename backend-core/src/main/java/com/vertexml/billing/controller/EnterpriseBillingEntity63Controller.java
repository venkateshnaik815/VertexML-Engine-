package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity63;
import com.vertexml.billing.service.EnterpriseBillingEntity63Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/63")
public class EnterpriseBillingEntity63Controller {
    private final EnterpriseBillingEntity63Service service;
    public EnterpriseBillingEntity63Controller(EnterpriseBillingEntity63Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity63> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity63 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity63 create(@RequestBody EnterpriseBillingEntity63 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity63 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity63 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
