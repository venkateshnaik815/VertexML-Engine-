package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity265;
import com.vertexml.generated.repo.GenEntity265Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity265Service {
    private final GenEntity265Repository repo;
    public GenEntity265Service(GenEntity265Repository repo) { this.repo = repo; }
    
    public List<GenEntity265> getAll() { return repo.findAll(); }
    public GenEntity265 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity265 create(GenEntity265 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity265 update(UUID id, GenEntity265 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity265> all = repo.findAll();
        for(GenEntity265 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
