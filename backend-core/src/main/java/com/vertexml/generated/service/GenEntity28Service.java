package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity28;
import com.vertexml.generated.repo.GenEntity28Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity28Service {
    private final GenEntity28Repository repo;
    public GenEntity28Service(GenEntity28Repository repo) { this.repo = repo; }
    
    public List<GenEntity28> getAll() { return repo.findAll(); }
    public GenEntity28 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity28 create(GenEntity28 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity28 update(UUID id, GenEntity28 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity28> all = repo.findAll();
        for(GenEntity28 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
