package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity82;
import com.vertexml.generated.repo.GenEntity82Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity82Service {
    private final GenEntity82Repository repo;
    public GenEntity82Service(GenEntity82Repository repo) { this.repo = repo; }
    
    public List<GenEntity82> getAll() { return repo.findAll(); }
    public GenEntity82 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity82 create(GenEntity82 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity82 update(UUID id, GenEntity82 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity82> all = repo.findAll();
        for(GenEntity82 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
