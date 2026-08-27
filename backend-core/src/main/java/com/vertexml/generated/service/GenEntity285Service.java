package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity285;
import com.vertexml.generated.repo.GenEntity285Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity285Service {
    private final GenEntity285Repository repo;
    public GenEntity285Service(GenEntity285Repository repo) { this.repo = repo; }
    
    public List<GenEntity285> getAll() { return repo.findAll(); }
    public GenEntity285 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity285 create(GenEntity285 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity285 update(UUID id, GenEntity285 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity285> all = repo.findAll();
        for(GenEntity285 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
