package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity293;
import com.vertexml.generated.repo.GenEntity293Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity293Service {
    private final GenEntity293Repository repo;
    public GenEntity293Service(GenEntity293Repository repo) { this.repo = repo; }
    
    public List<GenEntity293> getAll() { return repo.findAll(); }
    public GenEntity293 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity293 create(GenEntity293 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity293 update(UUID id, GenEntity293 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity293> all = repo.findAll();
        for(GenEntity293 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
