package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity26;
import com.vertexml.billing.service.EnterpriseBillingEntity26Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/26")
public class EnterpriseBillingEntity26Controller {
    private final EnterpriseBillingEntity26Service service;
    public EnterpriseBillingEntity26Controller(EnterpriseBillingEntity26Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity26> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity26 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity26 create(@RequestBody EnterpriseBillingEntity26 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity26 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity26 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
