package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity65;
import com.vertexml.generated.repo.GenEntity65Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity65Service {
    private final GenEntity65Repository repo;
    public GenEntity65Service(GenEntity65Repository repo) { this.repo = repo; }
    
    public List<GenEntity65> getAll() { return repo.findAll(); }
    public GenEntity65 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity65 create(GenEntity65 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity65 update(UUID id, GenEntity65 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity65> all = repo.findAll();
        for(GenEntity65 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
