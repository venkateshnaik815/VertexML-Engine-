package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity268;
import com.vertexml.generated.repo.GenEntity268Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity268Service {
    private final GenEntity268Repository repo;
    public GenEntity268Service(GenEntity268Repository repo) { this.repo = repo; }
    
    public List<GenEntity268> getAll() { return repo.findAll(); }
    public GenEntity268 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity268 create(GenEntity268 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity268 update(UUID id, GenEntity268 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity268> all = repo.findAll();
        for(GenEntity268 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
