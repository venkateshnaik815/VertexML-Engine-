package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity134;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity134Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/134")
public class EnterpriseAnalyticsEntity134Controller {
    private final EnterpriseAnalyticsEntity134Service service;
    public EnterpriseAnalyticsEntity134Controller(EnterpriseAnalyticsEntity134Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity134> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity134 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity134 create(@RequestBody EnterpriseAnalyticsEntity134 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity134 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity134 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
