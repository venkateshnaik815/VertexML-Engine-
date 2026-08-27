package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity207;
import com.vertexml.generated.repo.GenEntity207Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity207Service {
    private final GenEntity207Repository repo;
    public GenEntity207Service(GenEntity207Repository repo) { this.repo = repo; }
    
    public List<GenEntity207> getAll() { return repo.findAll(); }
    public GenEntity207 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity207 create(GenEntity207 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity207 update(UUID id, GenEntity207 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity207> all = repo.findAll();
        for(GenEntity207 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
