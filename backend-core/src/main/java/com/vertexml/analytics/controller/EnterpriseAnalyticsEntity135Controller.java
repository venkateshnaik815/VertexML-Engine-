package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity135;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity135Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/135")
public class EnterpriseAnalyticsEntity135Controller {
    private final EnterpriseAnalyticsEntity135Service service;
    public EnterpriseAnalyticsEntity135Controller(EnterpriseAnalyticsEntity135Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity135> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity135 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity135 create(@RequestBody EnterpriseAnalyticsEntity135 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity135 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity135 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
