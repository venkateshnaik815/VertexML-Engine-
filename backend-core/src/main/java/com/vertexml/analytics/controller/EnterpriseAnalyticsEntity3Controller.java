package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity3;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity3Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/3")
public class EnterpriseAnalyticsEntity3Controller {
    private final EnterpriseAnalyticsEntity3Service service;
    public EnterpriseAnalyticsEntity3Controller(EnterpriseAnalyticsEntity3Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity3> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity3 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity3 create(@RequestBody EnterpriseAnalyticsEntity3 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity3 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity3 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
