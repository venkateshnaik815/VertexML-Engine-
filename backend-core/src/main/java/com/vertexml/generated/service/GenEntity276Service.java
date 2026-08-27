package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity276;
import com.vertexml.generated.repo.GenEntity276Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity276Service {
    private final GenEntity276Repository repo;
    public GenEntity276Service(GenEntity276Repository repo) { this.repo = repo; }
    
    public List<GenEntity276> getAll() { return repo.findAll(); }
    public GenEntity276 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity276 create(GenEntity276 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity276 update(UUID id, GenEntity276 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity276> all = repo.findAll();
        for(GenEntity276 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
