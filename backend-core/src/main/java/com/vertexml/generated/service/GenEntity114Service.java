package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity114;
import com.vertexml.generated.repo.GenEntity114Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity114Service {
    private final GenEntity114Repository repo;
    public GenEntity114Service(GenEntity114Repository repo) { this.repo = repo; }
    
    public List<GenEntity114> getAll() { return repo.findAll(); }
    public GenEntity114 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity114 create(GenEntity114 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity114 update(UUID id, GenEntity114 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity114> all = repo.findAll();
        for(GenEntity114 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
