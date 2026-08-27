package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity127;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity127Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/127")
public class EnterpriseAnalyticsEntity127Controller {
    private final EnterpriseAnalyticsEntity127Service service;
    public EnterpriseAnalyticsEntity127Controller(EnterpriseAnalyticsEntity127Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity127> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity127 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity127 create(@RequestBody EnterpriseAnalyticsEntity127 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity127 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity127 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
