package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity116;
import com.vertexml.billing.service.EnterpriseBillingEntity116Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/116")
public class EnterpriseBillingEntity116Controller {
    private final EnterpriseBillingEntity116Service service;
    public EnterpriseBillingEntity116Controller(EnterpriseBillingEntity116Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity116> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity116 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity116 create(@RequestBody EnterpriseBillingEntity116 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity116 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity116 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
