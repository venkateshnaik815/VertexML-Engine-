package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity226;
import com.vertexml.generated.repo.GenEntity226Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity226Service {
    private final GenEntity226Repository repo;
    public GenEntity226Service(GenEntity226Repository repo) { this.repo = repo; }
    
    public List<GenEntity226> getAll() { return repo.findAll(); }
    public GenEntity226 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity226 create(GenEntity226 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity226 update(UUID id, GenEntity226 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity226> all = repo.findAll();
        for(GenEntity226 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
