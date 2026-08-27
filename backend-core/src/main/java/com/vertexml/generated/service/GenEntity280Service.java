package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity280;
import com.vertexml.generated.repo.GenEntity280Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity280Service {
    private final GenEntity280Repository repo;
    public GenEntity280Service(GenEntity280Repository repo) { this.repo = repo; }
    
    public List<GenEntity280> getAll() { return repo.findAll(); }
    public GenEntity280 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity280 create(GenEntity280 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity280 update(UUID id, GenEntity280 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity280> all = repo.findAll();
        for(GenEntity280 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
