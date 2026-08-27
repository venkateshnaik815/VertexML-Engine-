package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity18;
import com.vertexml.generated.repo.GenEntity18Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity18Service {
    private final GenEntity18Repository repo;
    public GenEntity18Service(GenEntity18Repository repo) { this.repo = repo; }
    
    public List<GenEntity18> getAll() { return repo.findAll(); }
    public GenEntity18 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity18 create(GenEntity18 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity18 update(UUID id, GenEntity18 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity18> all = repo.findAll();
        for(GenEntity18 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
