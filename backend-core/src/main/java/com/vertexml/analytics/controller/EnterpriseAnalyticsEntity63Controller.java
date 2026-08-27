package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity63;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity63Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/63")
public class EnterpriseAnalyticsEntity63Controller {
    private final EnterpriseAnalyticsEntity63Service service;
    public EnterpriseAnalyticsEntity63Controller(EnterpriseAnalyticsEntity63Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity63> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity63 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity63 create(@RequestBody EnterpriseAnalyticsEntity63 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity63 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity63 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
