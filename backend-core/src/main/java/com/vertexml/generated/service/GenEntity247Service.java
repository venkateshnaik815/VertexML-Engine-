package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity247;
import com.vertexml.generated.repo.GenEntity247Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity247Service {
    private final GenEntity247Repository repo;
    public GenEntity247Service(GenEntity247Repository repo) { this.repo = repo; }
    
    public List<GenEntity247> getAll() { return repo.findAll(); }
    public GenEntity247 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity247 create(GenEntity247 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity247 update(UUID id, GenEntity247 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity247> all = repo.findAll();
        for(GenEntity247 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
