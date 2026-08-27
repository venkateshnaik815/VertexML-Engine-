package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity118;
import com.vertexml.billing.service.EnterpriseBillingEntity118Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/118")
public class EnterpriseBillingEntity118Controller {
    private final EnterpriseBillingEntity118Service service;
    public EnterpriseBillingEntity118Controller(EnterpriseBillingEntity118Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity118> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity118 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity118 create(@RequestBody EnterpriseBillingEntity118 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity118 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity118 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
