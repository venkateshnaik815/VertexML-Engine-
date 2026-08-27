package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity233;
import com.vertexml.generated.repo.GenEntity233Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity233Service {
    private final GenEntity233Repository repo;
    public GenEntity233Service(GenEntity233Repository repo) { this.repo = repo; }
    
    public List<GenEntity233> getAll() { return repo.findAll(); }
    public GenEntity233 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity233 create(GenEntity233 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity233 update(UUID id, GenEntity233 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity233> all = repo.findAll();
        for(GenEntity233 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
