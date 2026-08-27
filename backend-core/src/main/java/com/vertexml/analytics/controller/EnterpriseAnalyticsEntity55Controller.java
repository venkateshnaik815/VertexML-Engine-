package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity55;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity55Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/55")
public class EnterpriseAnalyticsEntity55Controller {
    private final EnterpriseAnalyticsEntity55Service service;
    public EnterpriseAnalyticsEntity55Controller(EnterpriseAnalyticsEntity55Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity55> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity55 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity55 create(@RequestBody EnterpriseAnalyticsEntity55 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity55 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity55 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
