package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity225;
import com.vertexml.generated.repo.GenEntity225Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity225Service {
    private final GenEntity225Repository repo;
    public GenEntity225Service(GenEntity225Repository repo) { this.repo = repo; }
    
    public List<GenEntity225> getAll() { return repo.findAll(); }
    public GenEntity225 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity225 create(GenEntity225 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity225 update(UUID id, GenEntity225 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity225> all = repo.findAll();
        for(GenEntity225 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
