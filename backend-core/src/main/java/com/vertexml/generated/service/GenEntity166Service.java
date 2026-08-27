package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity166;
import com.vertexml.generated.repo.GenEntity166Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity166Service {
    private final GenEntity166Repository repo;
    public GenEntity166Service(GenEntity166Repository repo) { this.repo = repo; }
    
    public List<GenEntity166> getAll() { return repo.findAll(); }
    public GenEntity166 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity166 create(GenEntity166 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity166 update(UUID id, GenEntity166 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity166> all = repo.findAll();
        for(GenEntity166 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
