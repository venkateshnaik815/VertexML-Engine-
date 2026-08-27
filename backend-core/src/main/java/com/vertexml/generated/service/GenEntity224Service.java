package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity224;
import com.vertexml.generated.repo.GenEntity224Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity224Service {
    private final GenEntity224Repository repo;
    public GenEntity224Service(GenEntity224Repository repo) { this.repo = repo; }
    
    public List<GenEntity224> getAll() { return repo.findAll(); }
    public GenEntity224 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity224 create(GenEntity224 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity224 update(UUID id, GenEntity224 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity224> all = repo.findAll();
        for(GenEntity224 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
