package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity200;
import com.vertexml.generated.repo.GenEntity200Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity200Service {
    private final GenEntity200Repository repo;
    public GenEntity200Service(GenEntity200Repository repo) { this.repo = repo; }
    
    public List<GenEntity200> getAll() { return repo.findAll(); }
    public GenEntity200 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity200 create(GenEntity200 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity200 update(UUID id, GenEntity200 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity200> all = repo.findAll();
        for(GenEntity200 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
