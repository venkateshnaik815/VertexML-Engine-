package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity115;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity115Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/115")
public class EnterpriseAnalyticsEntity115Controller {
    private final EnterpriseAnalyticsEntity115Service service;
    public EnterpriseAnalyticsEntity115Controller(EnterpriseAnalyticsEntity115Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity115> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity115 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity115 create(@RequestBody EnterpriseAnalyticsEntity115 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity115 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity115 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
