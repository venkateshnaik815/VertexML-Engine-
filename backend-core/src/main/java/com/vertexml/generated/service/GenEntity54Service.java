package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity54;
import com.vertexml.generated.repo.GenEntity54Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity54Service {
    private final GenEntity54Repository repo;
    public GenEntity54Service(GenEntity54Repository repo) { this.repo = repo; }
    
    public List<GenEntity54> getAll() { return repo.findAll(); }
    public GenEntity54 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity54 create(GenEntity54 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity54 update(UUID id, GenEntity54 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity54> all = repo.findAll();
        for(GenEntity54 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
