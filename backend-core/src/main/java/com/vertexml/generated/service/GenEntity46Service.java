package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity46;
import com.vertexml.generated.repo.GenEntity46Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity46Service {
    private final GenEntity46Repository repo;
    public GenEntity46Service(GenEntity46Repository repo) { this.repo = repo; }
    
    public List<GenEntity46> getAll() { return repo.findAll(); }
    public GenEntity46 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity46 create(GenEntity46 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity46 update(UUID id, GenEntity46 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity46> all = repo.findAll();
        for(GenEntity46 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
