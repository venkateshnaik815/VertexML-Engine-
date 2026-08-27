package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity62;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity62Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/62")
public class EnterpriseAnalyticsEntity62Controller {
    private final EnterpriseAnalyticsEntity62Service service;
    public EnterpriseAnalyticsEntity62Controller(EnterpriseAnalyticsEntity62Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity62> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity62 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity62 create(@RequestBody EnterpriseAnalyticsEntity62 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity62 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity62 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
