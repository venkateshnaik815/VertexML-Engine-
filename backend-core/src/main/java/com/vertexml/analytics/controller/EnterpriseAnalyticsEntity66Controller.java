package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity66;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity66Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/66")
public class EnterpriseAnalyticsEntity66Controller {
    private final EnterpriseAnalyticsEntity66Service service;
    public EnterpriseAnalyticsEntity66Controller(EnterpriseAnalyticsEntity66Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity66> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity66 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity66 create(@RequestBody EnterpriseAnalyticsEntity66 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity66 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity66 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
