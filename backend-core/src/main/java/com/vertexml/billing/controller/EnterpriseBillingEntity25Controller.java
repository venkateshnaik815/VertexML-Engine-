package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity25;
import com.vertexml.billing.service.EnterpriseBillingEntity25Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/25")
public class EnterpriseBillingEntity25Controller {
    private final EnterpriseBillingEntity25Service service;
    public EnterpriseBillingEntity25Controller(EnterpriseBillingEntity25Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity25> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity25 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity25 create(@RequestBody EnterpriseBillingEntity25 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity25 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity25 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
