package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity17;
import com.vertexml.generated.repo.GenEntity17Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity17Service {
    private final GenEntity17Repository repo;
    public GenEntity17Service(GenEntity17Repository repo) { this.repo = repo; }
    
    public List<GenEntity17> getAll() { return repo.findAll(); }
    public GenEntity17 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity17 create(GenEntity17 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity17 update(UUID id, GenEntity17 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity17> all = repo.findAll();
        for(GenEntity17 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
