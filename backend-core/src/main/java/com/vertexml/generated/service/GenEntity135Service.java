package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity135;
import com.vertexml.generated.repo.GenEntity135Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity135Service {
    private final GenEntity135Repository repo;
    public GenEntity135Service(GenEntity135Repository repo) { this.repo = repo; }
    
    public List<GenEntity135> getAll() { return repo.findAll(); }
    public GenEntity135 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity135 create(GenEntity135 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity135 update(UUID id, GenEntity135 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity135> all = repo.findAll();
        for(GenEntity135 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
