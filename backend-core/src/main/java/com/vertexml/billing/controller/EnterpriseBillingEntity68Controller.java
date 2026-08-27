package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity68;
import com.vertexml.billing.service.EnterpriseBillingEntity68Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/68")
public class EnterpriseBillingEntity68Controller {
    private final EnterpriseBillingEntity68Service service;
    public EnterpriseBillingEntity68Controller(EnterpriseBillingEntity68Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity68> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity68 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity68 create(@RequestBody EnterpriseBillingEntity68 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity68 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity68 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
