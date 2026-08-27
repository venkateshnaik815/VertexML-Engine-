package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity129;
import com.vertexml.billing.service.EnterpriseBillingEntity129Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/129")
public class EnterpriseBillingEntity129Controller {
    private final EnterpriseBillingEntity129Service service;
    public EnterpriseBillingEntity129Controller(EnterpriseBillingEntity129Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity129> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity129 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity129 create(@RequestBody EnterpriseBillingEntity129 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity129 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity129 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
