package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity111;
import com.vertexml.billing.service.EnterpriseBillingEntity111Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/111")
public class EnterpriseBillingEntity111Controller {
    private final EnterpriseBillingEntity111Service service;
    public EnterpriseBillingEntity111Controller(EnterpriseBillingEntity111Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity111> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity111 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity111 create(@RequestBody EnterpriseBillingEntity111 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity111 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity111 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
