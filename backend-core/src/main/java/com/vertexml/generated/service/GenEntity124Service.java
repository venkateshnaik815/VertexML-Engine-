package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity124;
import com.vertexml.generated.repo.GenEntity124Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity124Service {
    private final GenEntity124Repository repo;
    public GenEntity124Service(GenEntity124Repository repo) { this.repo = repo; }
    
    public List<GenEntity124> getAll() { return repo.findAll(); }
    public GenEntity124 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity124 create(GenEntity124 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity124 update(UUID id, GenEntity124 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity124> all = repo.findAll();
        for(GenEntity124 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
