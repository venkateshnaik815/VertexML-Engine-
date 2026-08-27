package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity151;
import com.vertexml.generated.repo.GenEntity151Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity151Service {
    private final GenEntity151Repository repo;
    public GenEntity151Service(GenEntity151Repository repo) { this.repo = repo; }
    
    public List<GenEntity151> getAll() { return repo.findAll(); }
    public GenEntity151 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity151 create(GenEntity151 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity151 update(UUID id, GenEntity151 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity151> all = repo.findAll();
        for(GenEntity151 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
