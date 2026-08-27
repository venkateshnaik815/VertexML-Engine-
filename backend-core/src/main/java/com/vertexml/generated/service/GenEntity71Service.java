package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity71;
import com.vertexml.generated.repo.GenEntity71Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity71Service {
    private final GenEntity71Repository repo;
    public GenEntity71Service(GenEntity71Repository repo) { this.repo = repo; }
    
    public List<GenEntity71> getAll() { return repo.findAll(); }
    public GenEntity71 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity71 create(GenEntity71 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity71 update(UUID id, GenEntity71 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity71> all = repo.findAll();
        for(GenEntity71 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
