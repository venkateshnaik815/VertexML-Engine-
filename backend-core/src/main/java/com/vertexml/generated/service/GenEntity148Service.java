package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity148;
import com.vertexml.generated.repo.GenEntity148Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity148Service {
    private final GenEntity148Repository repo;
    public GenEntity148Service(GenEntity148Repository repo) { this.repo = repo; }
    
    public List<GenEntity148> getAll() { return repo.findAll(); }
    public GenEntity148 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity148 create(GenEntity148 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity148 update(UUID id, GenEntity148 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity148> all = repo.findAll();
        for(GenEntity148 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
