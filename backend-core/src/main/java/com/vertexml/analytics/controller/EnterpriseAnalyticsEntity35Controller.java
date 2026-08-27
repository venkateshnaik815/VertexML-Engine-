package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity35;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity35Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/35")
public class EnterpriseAnalyticsEntity35Controller {
    private final EnterpriseAnalyticsEntity35Service service;
    public EnterpriseAnalyticsEntity35Controller(EnterpriseAnalyticsEntity35Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity35> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity35 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity35 create(@RequestBody EnterpriseAnalyticsEntity35 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity35 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity35 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
