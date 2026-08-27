package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity129;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity129Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/129")
public class EnterpriseAnalyticsEntity129Controller {
    private final EnterpriseAnalyticsEntity129Service service;
    public EnterpriseAnalyticsEntity129Controller(EnterpriseAnalyticsEntity129Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity129> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity129 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity129 create(@RequestBody EnterpriseAnalyticsEntity129 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity129 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity129 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
