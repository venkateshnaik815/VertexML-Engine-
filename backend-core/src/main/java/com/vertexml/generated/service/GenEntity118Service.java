package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity118;
import com.vertexml.generated.repo.GenEntity118Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity118Service {
    private final GenEntity118Repository repo;
    public GenEntity118Service(GenEntity118Repository repo) { this.repo = repo; }
    
    public List<GenEntity118> getAll() { return repo.findAll(); }
    public GenEntity118 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity118 create(GenEntity118 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity118 update(UUID id, GenEntity118 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity118> all = repo.findAll();
        for(GenEntity118 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
