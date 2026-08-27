package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity3;
import com.vertexml.billing.service.EnterpriseBillingEntity3Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/3")
public class EnterpriseBillingEntity3Controller {
    private final EnterpriseBillingEntity3Service service;
    public EnterpriseBillingEntity3Controller(EnterpriseBillingEntity3Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity3> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity3 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity3 create(@RequestBody EnterpriseBillingEntity3 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity3 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity3 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
