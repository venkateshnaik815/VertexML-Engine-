package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity96;
import com.vertexml.generated.repo.GenEntity96Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity96Service {
    private final GenEntity96Repository repo;
    public GenEntity96Service(GenEntity96Repository repo) { this.repo = repo; }
    
    public List<GenEntity96> getAll() { return repo.findAll(); }
    public GenEntity96 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity96 create(GenEntity96 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity96 update(UUID id, GenEntity96 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity96> all = repo.findAll();
        for(GenEntity96 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
