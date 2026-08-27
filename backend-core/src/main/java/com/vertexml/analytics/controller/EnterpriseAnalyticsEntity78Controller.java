package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity78;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity78Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/78")
public class EnterpriseAnalyticsEntity78Controller {
    private final EnterpriseAnalyticsEntity78Service service;
    public EnterpriseAnalyticsEntity78Controller(EnterpriseAnalyticsEntity78Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity78> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity78 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity78 create(@RequestBody EnterpriseAnalyticsEntity78 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity78 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity78 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
