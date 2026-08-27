package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity120;
import com.vertexml.generated.repo.GenEntity120Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity120Service {
    private final GenEntity120Repository repo;
    public GenEntity120Service(GenEntity120Repository repo) { this.repo = repo; }
    
    public List<GenEntity120> getAll() { return repo.findAll(); }
    public GenEntity120 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity120 create(GenEntity120 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity120 update(UUID id, GenEntity120 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity120> all = repo.findAll();
        for(GenEntity120 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
