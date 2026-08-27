package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity133;
import com.vertexml.generated.repo.GenEntity133Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity133Service {
    private final GenEntity133Repository repo;
    public GenEntity133Service(GenEntity133Repository repo) { this.repo = repo; }
    
    public List<GenEntity133> getAll() { return repo.findAll(); }
    public GenEntity133 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity133 create(GenEntity133 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity133 update(UUID id, GenEntity133 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity133> all = repo.findAll();
        for(GenEntity133 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
