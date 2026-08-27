package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity246;
import com.vertexml.generated.repo.GenEntity246Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity246Service {
    private final GenEntity246Repository repo;
    public GenEntity246Service(GenEntity246Repository repo) { this.repo = repo; }
    
    public List<GenEntity246> getAll() { return repo.findAll(); }
    public GenEntity246 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity246 create(GenEntity246 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity246 update(UUID id, GenEntity246 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity246> all = repo.findAll();
        for(GenEntity246 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
