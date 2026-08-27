package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity162;
import com.vertexml.generated.repo.GenEntity162Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity162Service {
    private final GenEntity162Repository repo;
    public GenEntity162Service(GenEntity162Repository repo) { this.repo = repo; }
    
    public List<GenEntity162> getAll() { return repo.findAll(); }
    public GenEntity162 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity162 create(GenEntity162 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity162 update(UUID id, GenEntity162 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity162> all = repo.findAll();
        for(GenEntity162 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
