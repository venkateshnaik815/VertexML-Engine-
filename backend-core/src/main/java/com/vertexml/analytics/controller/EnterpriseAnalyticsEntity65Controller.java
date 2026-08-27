package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity65;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity65Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/65")
public class EnterpriseAnalyticsEntity65Controller {
    private final EnterpriseAnalyticsEntity65Service service;
    public EnterpriseAnalyticsEntity65Controller(EnterpriseAnalyticsEntity65Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity65> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity65 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity65 create(@RequestBody EnterpriseAnalyticsEntity65 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity65 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity65 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
