package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity117;
import com.vertexml.billing.service.EnterpriseBillingEntity117Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/117")
public class EnterpriseBillingEntity117Controller {
    private final EnterpriseBillingEntity117Service service;
    public EnterpriseBillingEntity117Controller(EnterpriseBillingEntity117Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity117> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity117 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity117 create(@RequestBody EnterpriseBillingEntity117 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity117 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity117 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
