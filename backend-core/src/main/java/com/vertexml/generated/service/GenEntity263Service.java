package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity263;
import com.vertexml.generated.repo.GenEntity263Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity263Service {
    private final GenEntity263Repository repo;
    public GenEntity263Service(GenEntity263Repository repo) { this.repo = repo; }
    
    public List<GenEntity263> getAll() { return repo.findAll(); }
    public GenEntity263 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity263 create(GenEntity263 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity263 update(UUID id, GenEntity263 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity263> all = repo.findAll();
        for(GenEntity263 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
