package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity94;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity94Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/94")
public class EnterpriseAnalyticsEntity94Controller {
    private final EnterpriseAnalyticsEntity94Service service;
    public EnterpriseAnalyticsEntity94Controller(EnterpriseAnalyticsEntity94Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity94> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity94 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity94 create(@RequestBody EnterpriseAnalyticsEntity94 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity94 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity94 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
