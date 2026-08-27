package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity27;
import com.vertexml.billing.service.EnterpriseBillingEntity27Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/27")
public class EnterpriseBillingEntity27Controller {
    private final EnterpriseBillingEntity27Service service;
    public EnterpriseBillingEntity27Controller(EnterpriseBillingEntity27Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity27> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity27 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity27 create(@RequestBody EnterpriseBillingEntity27 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity27 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity27 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
