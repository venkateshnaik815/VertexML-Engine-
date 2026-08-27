package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity5;
import com.vertexml.generated.repo.GenEntity5Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity5Service {
    private final GenEntity5Repository repo;
    public GenEntity5Service(GenEntity5Repository repo) { this.repo = repo; }
    
    public List<GenEntity5> getAll() { return repo.findAll(); }
    public GenEntity5 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity5 create(GenEntity5 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity5 update(UUID id, GenEntity5 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity5> all = repo.findAll();
        for(GenEntity5 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
