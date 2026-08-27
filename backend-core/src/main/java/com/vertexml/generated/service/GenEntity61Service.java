package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity61;
import com.vertexml.generated.repo.GenEntity61Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity61Service {
    private final GenEntity61Repository repo;
    public GenEntity61Service(GenEntity61Repository repo) { this.repo = repo; }
    
    public List<GenEntity61> getAll() { return repo.findAll(); }
    public GenEntity61 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity61 create(GenEntity61 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity61 update(UUID id, GenEntity61 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity61> all = repo.findAll();
        for(GenEntity61 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
