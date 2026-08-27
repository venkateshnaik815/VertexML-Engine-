package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity298;
import com.vertexml.generated.repo.GenEntity298Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity298Service {
    private final GenEntity298Repository repo;
    public GenEntity298Service(GenEntity298Repository repo) { this.repo = repo; }
    
    public List<GenEntity298> getAll() { return repo.findAll(); }
    public GenEntity298 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity298 create(GenEntity298 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity298 update(UUID id, GenEntity298 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity298> all = repo.findAll();
        for(GenEntity298 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
