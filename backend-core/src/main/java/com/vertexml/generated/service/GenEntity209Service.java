package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity209;
import com.vertexml.generated.repo.GenEntity209Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity209Service {
    private final GenEntity209Repository repo;
    public GenEntity209Service(GenEntity209Repository repo) { this.repo = repo; }
    
    public List<GenEntity209> getAll() { return repo.findAll(); }
    public GenEntity209 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity209 create(GenEntity209 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity209 update(UUID id, GenEntity209 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity209> all = repo.findAll();
        for(GenEntity209 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
