package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity42;
import com.vertexml.billing.service.EnterpriseBillingEntity42Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/42")
public class EnterpriseBillingEntity42Controller {
    private final EnterpriseBillingEntity42Service service;
    public EnterpriseBillingEntity42Controller(EnterpriseBillingEntity42Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity42> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity42 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity42 create(@RequestBody EnterpriseBillingEntity42 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity42 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity42 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
