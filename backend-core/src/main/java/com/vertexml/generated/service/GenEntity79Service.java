package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity79;
import com.vertexml.generated.repo.GenEntity79Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity79Service {
    private final GenEntity79Repository repo;
    public GenEntity79Service(GenEntity79Repository repo) { this.repo = repo; }
    
    public List<GenEntity79> getAll() { return repo.findAll(); }
    public GenEntity79 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity79 create(GenEntity79 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity79 update(UUID id, GenEntity79 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity79> all = repo.findAll();
        for(GenEntity79 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
