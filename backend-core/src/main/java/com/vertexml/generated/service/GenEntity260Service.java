package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity260;
import com.vertexml.generated.repo.GenEntity260Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity260Service {
    private final GenEntity260Repository repo;
    public GenEntity260Service(GenEntity260Repository repo) { this.repo = repo; }
    
    public List<GenEntity260> getAll() { return repo.findAll(); }
    public GenEntity260 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity260 create(GenEntity260 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity260 update(UUID id, GenEntity260 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity260> all = repo.findAll();
        for(GenEntity260 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
