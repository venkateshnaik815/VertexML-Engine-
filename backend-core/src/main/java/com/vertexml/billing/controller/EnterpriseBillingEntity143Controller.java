package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity143;
import com.vertexml.billing.service.EnterpriseBillingEntity143Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/143")
public class EnterpriseBillingEntity143Controller {
    private final EnterpriseBillingEntity143Service service;
    public EnterpriseBillingEntity143Controller(EnterpriseBillingEntity143Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity143> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity143 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity143 create(@RequestBody EnterpriseBillingEntity143 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity143 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity143 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
