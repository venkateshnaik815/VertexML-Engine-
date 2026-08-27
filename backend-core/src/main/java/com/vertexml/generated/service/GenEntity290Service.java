package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity290;
import com.vertexml.generated.repo.GenEntity290Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity290Service {
    private final GenEntity290Repository repo;
    public GenEntity290Service(GenEntity290Repository repo) { this.repo = repo; }
    
    public List<GenEntity290> getAll() { return repo.findAll(); }
    public GenEntity290 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity290 create(GenEntity290 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity290 update(UUID id, GenEntity290 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity290> all = repo.findAll();
        for(GenEntity290 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
