package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity29;
import com.vertexml.billing.service.EnterpriseBillingEntity29Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/29")
public class EnterpriseBillingEntity29Controller {
    private final EnterpriseBillingEntity29Service service;
    public EnterpriseBillingEntity29Controller(EnterpriseBillingEntity29Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity29> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity29 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity29 create(@RequestBody EnterpriseBillingEntity29 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity29 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity29 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
