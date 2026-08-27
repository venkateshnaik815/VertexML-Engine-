package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity121;
import com.vertexml.billing.service.EnterpriseBillingEntity121Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/121")
public class EnterpriseBillingEntity121Controller {
    private final EnterpriseBillingEntity121Service service;
    public EnterpriseBillingEntity121Controller(EnterpriseBillingEntity121Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity121> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity121 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity121 create(@RequestBody EnterpriseBillingEntity121 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity121 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity121 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
