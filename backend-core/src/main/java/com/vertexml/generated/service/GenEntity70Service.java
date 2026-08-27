package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity70;
import com.vertexml.generated.repo.GenEntity70Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity70Service {
    private final GenEntity70Repository repo;
    public GenEntity70Service(GenEntity70Repository repo) { this.repo = repo; }
    
    public List<GenEntity70> getAll() { return repo.findAll(); }
    public GenEntity70 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity70 create(GenEntity70 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity70 update(UUID id, GenEntity70 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity70> all = repo.findAll();
        for(GenEntity70 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
