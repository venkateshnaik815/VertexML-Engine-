package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity83;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity83Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/83")
public class EnterpriseAnalyticsEntity83Controller {
    private final EnterpriseAnalyticsEntity83Service service;
    public EnterpriseAnalyticsEntity83Controller(EnterpriseAnalyticsEntity83Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity83> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity83 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity83 create(@RequestBody EnterpriseAnalyticsEntity83 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity83 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity83 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
