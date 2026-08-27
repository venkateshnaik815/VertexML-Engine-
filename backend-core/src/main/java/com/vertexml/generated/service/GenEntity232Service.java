package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity232;
import com.vertexml.generated.repo.GenEntity232Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity232Service {
    private final GenEntity232Repository repo;
    public GenEntity232Service(GenEntity232Repository repo) { this.repo = repo; }
    
    public List<GenEntity232> getAll() { return repo.findAll(); }
    public GenEntity232 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity232 create(GenEntity232 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity232 update(UUID id, GenEntity232 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity232> all = repo.findAll();
        for(GenEntity232 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
