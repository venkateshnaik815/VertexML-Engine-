package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity51;
import com.vertexml.generated.repo.GenEntity51Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity51Service {
    private final GenEntity51Repository repo;
    public GenEntity51Service(GenEntity51Repository repo) { this.repo = repo; }
    
    public List<GenEntity51> getAll() { return repo.findAll(); }
    public GenEntity51 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity51 create(GenEntity51 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity51 update(UUID id, GenEntity51 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity51> all = repo.findAll();
        for(GenEntity51 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
