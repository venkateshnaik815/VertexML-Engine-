package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity188;
import com.vertexml.generated.repo.GenEntity188Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity188Service {
    private final GenEntity188Repository repo;
    public GenEntity188Service(GenEntity188Repository repo) { this.repo = repo; }
    
    public List<GenEntity188> getAll() { return repo.findAll(); }
    public GenEntity188 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity188 create(GenEntity188 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity188 update(UUID id, GenEntity188 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity188> all = repo.findAll();
        for(GenEntity188 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
