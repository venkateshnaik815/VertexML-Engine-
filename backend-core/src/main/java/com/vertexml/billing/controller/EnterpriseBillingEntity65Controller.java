package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity65;
import com.vertexml.billing.service.EnterpriseBillingEntity65Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/65")
public class EnterpriseBillingEntity65Controller {
    private final EnterpriseBillingEntity65Service service;
    public EnterpriseBillingEntity65Controller(EnterpriseBillingEntity65Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity65> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity65 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity65 create(@RequestBody EnterpriseBillingEntity65 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity65 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity65 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
