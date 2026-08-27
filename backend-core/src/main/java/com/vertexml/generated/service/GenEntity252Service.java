package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity252;
import com.vertexml.generated.repo.GenEntity252Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity252Service {
    private final GenEntity252Repository repo;
    public GenEntity252Service(GenEntity252Repository repo) { this.repo = repo; }
    
    public List<GenEntity252> getAll() { return repo.findAll(); }
    public GenEntity252 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity252 create(GenEntity252 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity252 update(UUID id, GenEntity252 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity252> all = repo.findAll();
        for(GenEntity252 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
