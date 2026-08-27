package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity37;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity37Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/37")
public class EnterpriseAnalyticsEntity37Controller {
    private final EnterpriseAnalyticsEntity37Service service;
    public EnterpriseAnalyticsEntity37Controller(EnterpriseAnalyticsEntity37Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity37> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity37 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity37 create(@RequestBody EnterpriseAnalyticsEntity37 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity37 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity37 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
