package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity136;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity136Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/136")
public class EnterpriseAnalyticsEntity136Controller {
    private final EnterpriseAnalyticsEntity136Service service;
    public EnterpriseAnalyticsEntity136Controller(EnterpriseAnalyticsEntity136Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity136> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity136 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity136 create(@RequestBody EnterpriseAnalyticsEntity136 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity136 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity136 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
