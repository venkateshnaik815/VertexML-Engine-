package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity31;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity31Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/31")
public class EnterpriseAnalyticsEntity31Controller {
    private final EnterpriseAnalyticsEntity31Service service;
    public EnterpriseAnalyticsEntity31Controller(EnterpriseAnalyticsEntity31Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity31> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity31 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity31 create(@RequestBody EnterpriseAnalyticsEntity31 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity31 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity31 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
