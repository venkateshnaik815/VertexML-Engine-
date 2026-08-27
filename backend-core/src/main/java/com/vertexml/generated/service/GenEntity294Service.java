package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity294;
import com.vertexml.generated.repo.GenEntity294Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity294Service {
    private final GenEntity294Repository repo;
    public GenEntity294Service(GenEntity294Repository repo) { this.repo = repo; }
    
    public List<GenEntity294> getAll() { return repo.findAll(); }
    public GenEntity294 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity294 create(GenEntity294 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity294 update(UUID id, GenEntity294 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity294> all = repo.findAll();
        for(GenEntity294 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
