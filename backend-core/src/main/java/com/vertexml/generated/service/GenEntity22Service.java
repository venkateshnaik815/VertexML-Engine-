package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity22;
import com.vertexml.generated.repo.GenEntity22Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity22Service {
    private final GenEntity22Repository repo;
    public GenEntity22Service(GenEntity22Repository repo) { this.repo = repo; }
    
    public List<GenEntity22> getAll() { return repo.findAll(); }
    public GenEntity22 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity22 create(GenEntity22 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity22 update(UUID id, GenEntity22 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity22> all = repo.findAll();
        for(GenEntity22 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
