package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity77;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity77Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/77")
public class EnterpriseAnalyticsEntity77Controller {
    private final EnterpriseAnalyticsEntity77Service service;
    public EnterpriseAnalyticsEntity77Controller(EnterpriseAnalyticsEntity77Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity77> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity77 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity77 create(@RequestBody EnterpriseAnalyticsEntity77 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity77 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity77 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
