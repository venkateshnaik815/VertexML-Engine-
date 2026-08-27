package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity189;
import com.vertexml.generated.repo.GenEntity189Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity189Service {
    private final GenEntity189Repository repo;
    public GenEntity189Service(GenEntity189Repository repo) { this.repo = repo; }
    
    public List<GenEntity189> getAll() { return repo.findAll(); }
    public GenEntity189 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity189 create(GenEntity189 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity189 update(UUID id, GenEntity189 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity189> all = repo.findAll();
        for(GenEntity189 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
