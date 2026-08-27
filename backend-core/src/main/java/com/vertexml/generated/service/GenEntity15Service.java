package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity15;
import com.vertexml.generated.repo.GenEntity15Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity15Service {
    private final GenEntity15Repository repo;
    public GenEntity15Service(GenEntity15Repository repo) { this.repo = repo; }
    
    public List<GenEntity15> getAll() { return repo.findAll(); }
    public GenEntity15 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity15 create(GenEntity15 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity15 update(UUID id, GenEntity15 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity15> all = repo.findAll();
        for(GenEntity15 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
