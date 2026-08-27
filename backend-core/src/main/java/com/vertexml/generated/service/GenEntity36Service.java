package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity36;
import com.vertexml.generated.repo.GenEntity36Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity36Service {
    private final GenEntity36Repository repo;
    public GenEntity36Service(GenEntity36Repository repo) { this.repo = repo; }
    
    public List<GenEntity36> getAll() { return repo.findAll(); }
    public GenEntity36 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity36 create(GenEntity36 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity36 update(UUID id, GenEntity36 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity36> all = repo.findAll();
        for(GenEntity36 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
