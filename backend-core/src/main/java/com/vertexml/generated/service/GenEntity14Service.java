package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity14;
import com.vertexml.generated.repo.GenEntity14Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity14Service {
    private final GenEntity14Repository repo;
    public GenEntity14Service(GenEntity14Repository repo) { this.repo = repo; }
    
    public List<GenEntity14> getAll() { return repo.findAll(); }
    public GenEntity14 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity14 create(GenEntity14 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity14 update(UUID id, GenEntity14 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity14> all = repo.findAll();
        for(GenEntity14 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
