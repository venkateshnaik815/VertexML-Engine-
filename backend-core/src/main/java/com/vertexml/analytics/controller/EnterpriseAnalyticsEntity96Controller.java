package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity96;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity96Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/96")
public class EnterpriseAnalyticsEntity96Controller {
    private final EnterpriseAnalyticsEntity96Service service;
    public EnterpriseAnalyticsEntity96Controller(EnterpriseAnalyticsEntity96Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity96> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity96 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity96 create(@RequestBody EnterpriseAnalyticsEntity96 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity96 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity96 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
