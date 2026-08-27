package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity34;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity34Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/34")
public class EnterpriseAnalyticsEntity34Controller {
    private final EnterpriseAnalyticsEntity34Service service;
    public EnterpriseAnalyticsEntity34Controller(EnterpriseAnalyticsEntity34Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity34> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity34 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity34 create(@RequestBody EnterpriseAnalyticsEntity34 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity34 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity34 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
