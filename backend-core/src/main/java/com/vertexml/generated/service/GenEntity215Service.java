package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity215;
import com.vertexml.generated.repo.GenEntity215Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity215Service {
    private final GenEntity215Repository repo;
    public GenEntity215Service(GenEntity215Repository repo) { this.repo = repo; }
    
    public List<GenEntity215> getAll() { return repo.findAll(); }
    public GenEntity215 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity215 create(GenEntity215 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity215 update(UUID id, GenEntity215 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity215> all = repo.findAll();
        for(GenEntity215 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
