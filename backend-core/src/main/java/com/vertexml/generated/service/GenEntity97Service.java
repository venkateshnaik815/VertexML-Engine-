package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity97;
import com.vertexml.generated.repo.GenEntity97Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity97Service {
    private final GenEntity97Repository repo;
    public GenEntity97Service(GenEntity97Repository repo) { this.repo = repo; }
    
    public List<GenEntity97> getAll() { return repo.findAll(); }
    public GenEntity97 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity97 create(GenEntity97 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity97 update(UUID id, GenEntity97 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity97> all = repo.findAll();
        for(GenEntity97 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
