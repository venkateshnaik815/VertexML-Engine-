package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity15;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity15Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/15")
public class EnterpriseAnalyticsEntity15Controller {
    private final EnterpriseAnalyticsEntity15Service service;
    public EnterpriseAnalyticsEntity15Controller(EnterpriseAnalyticsEntity15Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity15> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity15 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity15 create(@RequestBody EnterpriseAnalyticsEntity15 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity15 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity15 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
