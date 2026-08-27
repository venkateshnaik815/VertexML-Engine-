package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity2;
import com.vertexml.billing.service.EnterpriseBillingEntity2Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/2")
public class EnterpriseBillingEntity2Controller {
    private final EnterpriseBillingEntity2Service service;
    public EnterpriseBillingEntity2Controller(EnterpriseBillingEntity2Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity2> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity2 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity2 create(@RequestBody EnterpriseBillingEntity2 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity2 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity2 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
