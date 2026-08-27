package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity95;
import com.vertexml.generated.repo.GenEntity95Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity95Service {
    private final GenEntity95Repository repo;
    public GenEntity95Service(GenEntity95Repository repo) { this.repo = repo; }
    
    public List<GenEntity95> getAll() { return repo.findAll(); }
    public GenEntity95 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity95 create(GenEntity95 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity95 update(UUID id, GenEntity95 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity95> all = repo.findAll();
        for(GenEntity95 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
