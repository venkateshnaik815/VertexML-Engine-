package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity77;
import com.vertexml.generated.repo.GenEntity77Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity77Service {
    private final GenEntity77Repository repo;
    public GenEntity77Service(GenEntity77Repository repo) { this.repo = repo; }
    
    public List<GenEntity77> getAll() { return repo.findAll(); }
    public GenEntity77 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity77 create(GenEntity77 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity77 update(UUID id, GenEntity77 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity77> all = repo.findAll();
        for(GenEntity77 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
