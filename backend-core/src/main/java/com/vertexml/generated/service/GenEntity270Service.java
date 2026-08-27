package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity270;
import com.vertexml.generated.repo.GenEntity270Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity270Service {
    private final GenEntity270Repository repo;
    public GenEntity270Service(GenEntity270Repository repo) { this.repo = repo; }
    
    public List<GenEntity270> getAll() { return repo.findAll(); }
    public GenEntity270 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity270 create(GenEntity270 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity270 update(UUID id, GenEntity270 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity270> all = repo.findAll();
        for(GenEntity270 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
