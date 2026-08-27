package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity110;
import com.vertexml.generated.repo.GenEntity110Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity110Service {
    private final GenEntity110Repository repo;
    public GenEntity110Service(GenEntity110Repository repo) { this.repo = repo; }
    
    public List<GenEntity110> getAll() { return repo.findAll(); }
    public GenEntity110 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity110 create(GenEntity110 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity110 update(UUID id, GenEntity110 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity110> all = repo.findAll();
        for(GenEntity110 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
