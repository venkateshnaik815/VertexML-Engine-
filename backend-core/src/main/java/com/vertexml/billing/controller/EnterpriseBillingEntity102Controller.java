package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity102;
import com.vertexml.billing.service.EnterpriseBillingEntity102Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/102")
public class EnterpriseBillingEntity102Controller {
    private final EnterpriseBillingEntity102Service service;
    public EnterpriseBillingEntity102Controller(EnterpriseBillingEntity102Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity102> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity102 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity102 create(@RequestBody EnterpriseBillingEntity102 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity102 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity102 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
