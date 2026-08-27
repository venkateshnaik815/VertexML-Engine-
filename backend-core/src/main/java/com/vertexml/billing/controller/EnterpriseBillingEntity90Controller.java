package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity90;
import com.vertexml.billing.service.EnterpriseBillingEntity90Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/90")
public class EnterpriseBillingEntity90Controller {
    private final EnterpriseBillingEntity90Service service;
    public EnterpriseBillingEntity90Controller(EnterpriseBillingEntity90Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity90> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity90 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity90 create(@RequestBody EnterpriseBillingEntity90 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity90 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity90 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
