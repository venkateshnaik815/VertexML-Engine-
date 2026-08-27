package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity130;
import com.vertexml.billing.service.EnterpriseBillingEntity130Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/130")
public class EnterpriseBillingEntity130Controller {
    private final EnterpriseBillingEntity130Service service;
    public EnterpriseBillingEntity130Controller(EnterpriseBillingEntity130Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity130> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity130 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity130 create(@RequestBody EnterpriseBillingEntity130 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity130 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity130 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
