package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity281;
import com.vertexml.generated.repo.GenEntity281Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity281Service {
    private final GenEntity281Repository repo;
    public GenEntity281Service(GenEntity281Repository repo) { this.repo = repo; }
    
    public List<GenEntity281> getAll() { return repo.findAll(); }
    public GenEntity281 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity281 create(GenEntity281 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity281 update(UUID id, GenEntity281 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity281> all = repo.findAll();
        for(GenEntity281 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
