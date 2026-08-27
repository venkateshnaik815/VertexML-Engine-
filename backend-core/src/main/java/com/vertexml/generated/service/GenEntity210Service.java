package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity210;
import com.vertexml.generated.repo.GenEntity210Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity210Service {
    private final GenEntity210Repository repo;
    public GenEntity210Service(GenEntity210Repository repo) { this.repo = repo; }
    
    public List<GenEntity210> getAll() { return repo.findAll(); }
    public GenEntity210 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity210 create(GenEntity210 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity210 update(UUID id, GenEntity210 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity210> all = repo.findAll();
        for(GenEntity210 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
