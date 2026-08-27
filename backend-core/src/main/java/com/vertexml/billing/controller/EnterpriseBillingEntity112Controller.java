package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity112;
import com.vertexml.billing.service.EnterpriseBillingEntity112Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/112")
public class EnterpriseBillingEntity112Controller {
    private final EnterpriseBillingEntity112Service service;
    public EnterpriseBillingEntity112Controller(EnterpriseBillingEntity112Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity112> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity112 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity112 create(@RequestBody EnterpriseBillingEntity112 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity112 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity112 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
