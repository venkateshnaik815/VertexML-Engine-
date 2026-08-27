package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity123;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity123Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/123")
public class EnterpriseAnalyticsEntity123Controller {
    private final EnterpriseAnalyticsEntity123Service service;
    public EnterpriseAnalyticsEntity123Controller(EnterpriseAnalyticsEntity123Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity123> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity123 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity123 create(@RequestBody EnterpriseAnalyticsEntity123 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity123 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity123 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
