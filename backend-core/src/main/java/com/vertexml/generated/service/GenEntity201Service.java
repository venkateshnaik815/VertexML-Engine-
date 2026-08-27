package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity201;
import com.vertexml.generated.repo.GenEntity201Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity201Service {
    private final GenEntity201Repository repo;
    public GenEntity201Service(GenEntity201Repository repo) { this.repo = repo; }
    
    public List<GenEntity201> getAll() { return repo.findAll(); }
    public GenEntity201 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity201 create(GenEntity201 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity201 update(UUID id, GenEntity201 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity201> all = repo.findAll();
        for(GenEntity201 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
