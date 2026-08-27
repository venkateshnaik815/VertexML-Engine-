package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity14;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity14Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/14")
public class EnterpriseAnalyticsEntity14Controller {
    private final EnterpriseAnalyticsEntity14Service service;
    public EnterpriseAnalyticsEntity14Controller(EnterpriseAnalyticsEntity14Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity14> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity14 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity14 create(@RequestBody EnterpriseAnalyticsEntity14 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity14 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity14 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
