package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity87;
import com.vertexml.generated.repo.GenEntity87Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity87Service {
    private final GenEntity87Repository repo;
    public GenEntity87Service(GenEntity87Repository repo) { this.repo = repo; }
    
    public List<GenEntity87> getAll() { return repo.findAll(); }
    public GenEntity87 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity87 create(GenEntity87 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity87 update(UUID id, GenEntity87 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity87> all = repo.findAll();
        for(GenEntity87 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
