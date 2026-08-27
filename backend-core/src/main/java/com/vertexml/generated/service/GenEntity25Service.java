package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity25;
import com.vertexml.generated.repo.GenEntity25Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity25Service {
    private final GenEntity25Repository repo;
    public GenEntity25Service(GenEntity25Repository repo) { this.repo = repo; }
    
    public List<GenEntity25> getAll() { return repo.findAll(); }
    public GenEntity25 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity25 create(GenEntity25 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity25 update(UUID id, GenEntity25 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity25> all = repo.findAll();
        for(GenEntity25 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
