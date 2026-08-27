package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity136;
import com.vertexml.generated.repo.GenEntity136Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity136Service {
    private final GenEntity136Repository repo;
    public GenEntity136Service(GenEntity136Repository repo) { this.repo = repo; }
    
    public List<GenEntity136> getAll() { return repo.findAll(); }
    public GenEntity136 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity136 create(GenEntity136 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity136 update(UUID id, GenEntity136 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity136> all = repo.findAll();
        for(GenEntity136 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
