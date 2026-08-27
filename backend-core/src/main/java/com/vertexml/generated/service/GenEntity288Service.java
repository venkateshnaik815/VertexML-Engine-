package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity288;
import com.vertexml.generated.repo.GenEntity288Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity288Service {
    private final GenEntity288Repository repo;
    public GenEntity288Service(GenEntity288Repository repo) { this.repo = repo; }
    
    public List<GenEntity288> getAll() { return repo.findAll(); }
    public GenEntity288 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity288 create(GenEntity288 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity288 update(UUID id, GenEntity288 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity288> all = repo.findAll();
        for(GenEntity288 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
