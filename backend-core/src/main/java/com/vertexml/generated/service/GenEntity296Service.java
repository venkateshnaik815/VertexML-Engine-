package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity296;
import com.vertexml.generated.repo.GenEntity296Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity296Service {
    private final GenEntity296Repository repo;
    public GenEntity296Service(GenEntity296Repository repo) { this.repo = repo; }
    
    public List<GenEntity296> getAll() { return repo.findAll(); }
    public GenEntity296 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity296 create(GenEntity296 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity296 update(UUID id, GenEntity296 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity296> all = repo.findAll();
        for(GenEntity296 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
