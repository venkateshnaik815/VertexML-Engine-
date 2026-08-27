package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity132;
import com.vertexml.billing.service.EnterpriseBillingEntity132Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/132")
public class EnterpriseBillingEntity132Controller {
    private final EnterpriseBillingEntity132Service service;
    public EnterpriseBillingEntity132Controller(EnterpriseBillingEntity132Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity132> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity132 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity132 create(@RequestBody EnterpriseBillingEntity132 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity132 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity132 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
