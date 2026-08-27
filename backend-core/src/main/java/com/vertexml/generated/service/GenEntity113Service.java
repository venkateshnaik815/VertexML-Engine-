package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity113;
import com.vertexml.generated.repo.GenEntity113Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity113Service {
    private final GenEntity113Repository repo;
    public GenEntity113Service(GenEntity113Repository repo) { this.repo = repo; }
    
    public List<GenEntity113> getAll() { return repo.findAll(); }
    public GenEntity113 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity113 create(GenEntity113 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity113 update(UUID id, GenEntity113 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity113> all = repo.findAll();
        for(GenEntity113 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
