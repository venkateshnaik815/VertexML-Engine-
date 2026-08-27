package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity219;
import com.vertexml.generated.repo.GenEntity219Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity219Service {
    private final GenEntity219Repository repo;
    public GenEntity219Service(GenEntity219Repository repo) { this.repo = repo; }
    
    public List<GenEntity219> getAll() { return repo.findAll(); }
    public GenEntity219 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity219 create(GenEntity219 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity219 update(UUID id, GenEntity219 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity219> all = repo.findAll();
        for(GenEntity219 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
