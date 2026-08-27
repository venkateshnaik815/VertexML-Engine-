package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity287;
import com.vertexml.generated.repo.GenEntity287Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity287Service {
    private final GenEntity287Repository repo;
    public GenEntity287Service(GenEntity287Repository repo) { this.repo = repo; }
    
    public List<GenEntity287> getAll() { return repo.findAll(); }
    public GenEntity287 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity287 create(GenEntity287 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity287 update(UUID id, GenEntity287 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity287> all = repo.findAll();
        for(GenEntity287 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
