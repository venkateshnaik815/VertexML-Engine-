package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity240;
import com.vertexml.generated.repo.GenEntity240Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity240Service {
    private final GenEntity240Repository repo;
    public GenEntity240Service(GenEntity240Repository repo) { this.repo = repo; }
    
    public List<GenEntity240> getAll() { return repo.findAll(); }
    public GenEntity240 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity240 create(GenEntity240 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity240 update(UUID id, GenEntity240 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity240> all = repo.findAll();
        for(GenEntity240 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
