package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity242;
import com.vertexml.generated.repo.GenEntity242Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity242Service {
    private final GenEntity242Repository repo;
    public GenEntity242Service(GenEntity242Repository repo) { this.repo = repo; }
    
    public List<GenEntity242> getAll() { return repo.findAll(); }
    public GenEntity242 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity242 create(GenEntity242 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity242 update(UUID id, GenEntity242 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity242> all = repo.findAll();
        for(GenEntity242 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
