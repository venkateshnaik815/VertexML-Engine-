package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity283;
import com.vertexml.generated.repo.GenEntity283Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity283Service {
    private final GenEntity283Repository repo;
    public GenEntity283Service(GenEntity283Repository repo) { this.repo = repo; }
    
    public List<GenEntity283> getAll() { return repo.findAll(); }
    public GenEntity283 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity283 create(GenEntity283 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity283 update(UUID id, GenEntity283 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity283> all = repo.findAll();
        for(GenEntity283 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
