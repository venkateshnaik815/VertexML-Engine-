package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity109;
import com.vertexml.billing.service.EnterpriseBillingEntity109Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/109")
public class EnterpriseBillingEntity109Controller {
    private final EnterpriseBillingEntity109Service service;
    public EnterpriseBillingEntity109Controller(EnterpriseBillingEntity109Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity109> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity109 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity109 create(@RequestBody EnterpriseBillingEntity109 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity109 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity109 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
