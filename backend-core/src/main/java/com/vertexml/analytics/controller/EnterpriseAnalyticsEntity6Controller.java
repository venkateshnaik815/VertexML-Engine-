package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity6;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity6Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/6")
public class EnterpriseAnalyticsEntity6Controller {
    private final EnterpriseAnalyticsEntity6Service service;
    public EnterpriseAnalyticsEntity6Controller(EnterpriseAnalyticsEntity6Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity6> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity6 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity6 create(@RequestBody EnterpriseAnalyticsEntity6 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity6 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity6 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
