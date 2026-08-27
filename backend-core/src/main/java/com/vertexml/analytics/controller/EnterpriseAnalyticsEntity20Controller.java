package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity20;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity20Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/20")
public class EnterpriseAnalyticsEntity20Controller {
    private final EnterpriseAnalyticsEntity20Service service;
    public EnterpriseAnalyticsEntity20Controller(EnterpriseAnalyticsEntity20Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity20> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity20 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity20 create(@RequestBody EnterpriseAnalyticsEntity20 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity20 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity20 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
