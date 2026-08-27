package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity243;
import com.vertexml.generated.repo.GenEntity243Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity243Service {
    private final GenEntity243Repository repo;
    public GenEntity243Service(GenEntity243Repository repo) { this.repo = repo; }
    
    public List<GenEntity243> getAll() { return repo.findAll(); }
    public GenEntity243 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity243 create(GenEntity243 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity243 update(UUID id, GenEntity243 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity243> all = repo.findAll();
        for(GenEntity243 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
