package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity154;
import com.vertexml.generated.repo.GenEntity154Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity154Service {
    private final GenEntity154Repository repo;
    public GenEntity154Service(GenEntity154Repository repo) { this.repo = repo; }
    
    public List<GenEntity154> getAll() { return repo.findAll(); }
    public GenEntity154 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity154 create(GenEntity154 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity154 update(UUID id, GenEntity154 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity154> all = repo.findAll();
        for(GenEntity154 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
