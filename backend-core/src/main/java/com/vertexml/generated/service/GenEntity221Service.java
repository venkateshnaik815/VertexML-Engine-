package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity221;
import com.vertexml.generated.repo.GenEntity221Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity221Service {
    private final GenEntity221Repository repo;
    public GenEntity221Service(GenEntity221Repository repo) { this.repo = repo; }
    
    public List<GenEntity221> getAll() { return repo.findAll(); }
    public GenEntity221 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity221 create(GenEntity221 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity221 update(UUID id, GenEntity221 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity221> all = repo.findAll();
        for(GenEntity221 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
