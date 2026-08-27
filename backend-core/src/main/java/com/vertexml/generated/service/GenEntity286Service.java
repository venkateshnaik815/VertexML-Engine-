package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity286;
import com.vertexml.generated.repo.GenEntity286Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity286Service {
    private final GenEntity286Repository repo;
    public GenEntity286Service(GenEntity286Repository repo) { this.repo = repo; }
    
    public List<GenEntity286> getAll() { return repo.findAll(); }
    public GenEntity286 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity286 create(GenEntity286 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity286 update(UUID id, GenEntity286 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity286> all = repo.findAll();
        for(GenEntity286 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
