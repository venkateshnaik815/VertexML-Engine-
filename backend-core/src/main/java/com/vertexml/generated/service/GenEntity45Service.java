package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity45;
import com.vertexml.generated.repo.GenEntity45Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity45Service {
    private final GenEntity45Repository repo;
    public GenEntity45Service(GenEntity45Repository repo) { this.repo = repo; }
    
    public List<GenEntity45> getAll() { return repo.findAll(); }
    public GenEntity45 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity45 create(GenEntity45 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity45 update(UUID id, GenEntity45 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity45> all = repo.findAll();
        for(GenEntity45 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
