package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity114;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity114Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/114")
public class EnterpriseAnalyticsEntity114Controller {
    private final EnterpriseAnalyticsEntity114Service service;
    public EnterpriseAnalyticsEntity114Controller(EnterpriseAnalyticsEntity114Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity114> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity114 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity114 create(@RequestBody EnterpriseAnalyticsEntity114 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity114 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity114 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
