package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity38;
import com.vertexml.generated.repo.GenEntity38Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity38Service {
    private final GenEntity38Repository repo;
    public GenEntity38Service(GenEntity38Repository repo) { this.repo = repo; }
    
    public List<GenEntity38> getAll() { return repo.findAll(); }
    public GenEntity38 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity38 create(GenEntity38 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity38 update(UUID id, GenEntity38 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity38> all = repo.findAll();
        for(GenEntity38 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
