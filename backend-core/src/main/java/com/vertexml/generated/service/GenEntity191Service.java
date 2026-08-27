package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity191;
import com.vertexml.generated.repo.GenEntity191Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity191Service {
    private final GenEntity191Repository repo;
    public GenEntity191Service(GenEntity191Repository repo) { this.repo = repo; }
    
    public List<GenEntity191> getAll() { return repo.findAll(); }
    public GenEntity191 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity191 create(GenEntity191 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity191 update(UUID id, GenEntity191 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity191> all = repo.findAll();
        for(GenEntity191 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
