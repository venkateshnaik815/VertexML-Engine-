package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity266;
import com.vertexml.generated.repo.GenEntity266Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity266Service {
    private final GenEntity266Repository repo;
    public GenEntity266Service(GenEntity266Repository repo) { this.repo = repo; }
    
    public List<GenEntity266> getAll() { return repo.findAll(); }
    public GenEntity266 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity266 create(GenEntity266 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity266 update(UUID id, GenEntity266 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity266> all = repo.findAll();
        for(GenEntity266 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
