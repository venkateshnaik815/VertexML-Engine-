package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity51;
import com.vertexml.billing.service.EnterpriseBillingEntity51Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/51")
public class EnterpriseBillingEntity51Controller {
    private final EnterpriseBillingEntity51Service service;
    public EnterpriseBillingEntity51Controller(EnterpriseBillingEntity51Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity51> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity51 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity51 create(@RequestBody EnterpriseBillingEntity51 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity51 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity51 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
