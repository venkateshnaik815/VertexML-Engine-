package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity138;
import com.vertexml.billing.service.EnterpriseBillingEntity138Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/138")
public class EnterpriseBillingEntity138Controller {
    private final EnterpriseBillingEntity138Service service;
    public EnterpriseBillingEntity138Controller(EnterpriseBillingEntity138Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity138> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity138 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity138 create(@RequestBody EnterpriseBillingEntity138 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity138 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity138 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
