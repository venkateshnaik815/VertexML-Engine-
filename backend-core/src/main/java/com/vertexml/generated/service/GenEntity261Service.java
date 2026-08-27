package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity261;
import com.vertexml.generated.repo.GenEntity261Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity261Service {
    private final GenEntity261Repository repo;
    public GenEntity261Service(GenEntity261Repository repo) { this.repo = repo; }
    
    public List<GenEntity261> getAll() { return repo.findAll(); }
    public GenEntity261 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity261 create(GenEntity261 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity261 update(UUID id, GenEntity261 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity261> all = repo.findAll();
        for(GenEntity261 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
