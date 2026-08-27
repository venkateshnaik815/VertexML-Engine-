package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity253;
import com.vertexml.generated.repo.GenEntity253Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity253Service {
    private final GenEntity253Repository repo;
    public GenEntity253Service(GenEntity253Repository repo) { this.repo = repo; }
    
    public List<GenEntity253> getAll() { return repo.findAll(); }
    public GenEntity253 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity253 create(GenEntity253 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity253 update(UUID id, GenEntity253 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity253> all = repo.findAll();
        for(GenEntity253 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
