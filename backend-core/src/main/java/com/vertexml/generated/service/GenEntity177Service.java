package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity177;
import com.vertexml.generated.repo.GenEntity177Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity177Service {
    private final GenEntity177Repository repo;
    public GenEntity177Service(GenEntity177Repository repo) { this.repo = repo; }
    
    public List<GenEntity177> getAll() { return repo.findAll(); }
    public GenEntity177 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity177 create(GenEntity177 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity177 update(UUID id, GenEntity177 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity177> all = repo.findAll();
        for(GenEntity177 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
