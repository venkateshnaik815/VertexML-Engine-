package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity31;
import com.vertexml.generated.repo.GenEntity31Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity31Service {
    private final GenEntity31Repository repo;
    public GenEntity31Service(GenEntity31Repository repo) { this.repo = repo; }
    
    public List<GenEntity31> getAll() { return repo.findAll(); }
    public GenEntity31 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity31 create(GenEntity31 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity31 update(UUID id, GenEntity31 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity31> all = repo.findAll();
        for(GenEntity31 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
