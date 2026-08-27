package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity56;
import com.vertexml.billing.service.EnterpriseBillingEntity56Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/56")
public class EnterpriseBillingEntity56Controller {
    private final EnterpriseBillingEntity56Service service;
    public EnterpriseBillingEntity56Controller(EnterpriseBillingEntity56Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity56> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity56 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity56 create(@RequestBody EnterpriseBillingEntity56 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity56 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity56 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
