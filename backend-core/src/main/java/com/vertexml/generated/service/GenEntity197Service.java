package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity197;
import com.vertexml.generated.repo.GenEntity197Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity197Service {
    private final GenEntity197Repository repo;
    public GenEntity197Service(GenEntity197Repository repo) { this.repo = repo; }
    
    public List<GenEntity197> getAll() { return repo.findAll(); }
    public GenEntity197 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity197 create(GenEntity197 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity197 update(UUID id, GenEntity197 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity197> all = repo.findAll();
        for(GenEntity197 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
