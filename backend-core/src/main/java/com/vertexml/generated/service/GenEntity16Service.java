package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity16;
import com.vertexml.generated.repo.GenEntity16Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity16Service {
    private final GenEntity16Repository repo;
    public GenEntity16Service(GenEntity16Repository repo) { this.repo = repo; }
    
    public List<GenEntity16> getAll() { return repo.findAll(); }
    public GenEntity16 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity16 create(GenEntity16 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity16 update(UUID id, GenEntity16 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity16> all = repo.findAll();
        for(GenEntity16 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
