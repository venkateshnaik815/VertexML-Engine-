package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity109;
import com.vertexml.generated.repo.GenEntity109Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity109Service {
    private final GenEntity109Repository repo;
    public GenEntity109Service(GenEntity109Repository repo) { this.repo = repo; }
    
    public List<GenEntity109> getAll() { return repo.findAll(); }
    public GenEntity109 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity109 create(GenEntity109 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity109 update(UUID id, GenEntity109 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity109> all = repo.findAll();
        for(GenEntity109 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
