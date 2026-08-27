package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity9;
import com.vertexml.billing.service.EnterpriseBillingEntity9Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/9")
public class EnterpriseBillingEntity9Controller {
    private final EnterpriseBillingEntity9Service service;
    public EnterpriseBillingEntity9Controller(EnterpriseBillingEntity9Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity9> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity9 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity9 create(@RequestBody EnterpriseBillingEntity9 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity9 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity9 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
