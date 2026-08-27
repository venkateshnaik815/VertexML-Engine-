package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity107;
import com.vertexml.generated.repo.GenEntity107Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity107Service {
    private final GenEntity107Repository repo;
    public GenEntity107Service(GenEntity107Repository repo) { this.repo = repo; }
    
    public List<GenEntity107> getAll() { return repo.findAll(); }
    public GenEntity107 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity107 create(GenEntity107 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity107 update(UUID id, GenEntity107 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity107> all = repo.findAll();
        for(GenEntity107 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
