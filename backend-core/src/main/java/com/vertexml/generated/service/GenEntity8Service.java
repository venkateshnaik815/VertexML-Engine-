package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity8;
import com.vertexml.generated.repo.GenEntity8Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity8Service {
    private final GenEntity8Repository repo;
    public GenEntity8Service(GenEntity8Repository repo) { this.repo = repo; }
    
    public List<GenEntity8> getAll() { return repo.findAll(); }
    public GenEntity8 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity8 create(GenEntity8 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity8 update(UUID id, GenEntity8 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity8> all = repo.findAll();
        for(GenEntity8 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
