package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity144;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity144Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/144")
public class EnterpriseAnalyticsEntity144Controller {
    private final EnterpriseAnalyticsEntity144Service service;
    public EnterpriseAnalyticsEntity144Controller(EnterpriseAnalyticsEntity144Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity144> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity144 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity144 create(@RequestBody EnterpriseAnalyticsEntity144 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity144 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity144 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
