package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity159;
import com.vertexml.generated.repo.GenEntity159Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity159Service {
    private final GenEntity159Repository repo;
    public GenEntity159Service(GenEntity159Repository repo) { this.repo = repo; }
    
    public List<GenEntity159> getAll() { return repo.findAll(); }
    public GenEntity159 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity159 create(GenEntity159 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity159 update(UUID id, GenEntity159 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity159> all = repo.findAll();
        for(GenEntity159 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
