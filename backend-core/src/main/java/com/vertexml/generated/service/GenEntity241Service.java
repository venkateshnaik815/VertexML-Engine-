package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity241;
import com.vertexml.generated.repo.GenEntity241Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity241Service {
    private final GenEntity241Repository repo;
    public GenEntity241Service(GenEntity241Repository repo) { this.repo = repo; }
    
    public List<GenEntity241> getAll() { return repo.findAll(); }
    public GenEntity241 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity241 create(GenEntity241 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity241 update(UUID id, GenEntity241 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity241> all = repo.findAll();
        for(GenEntity241 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
