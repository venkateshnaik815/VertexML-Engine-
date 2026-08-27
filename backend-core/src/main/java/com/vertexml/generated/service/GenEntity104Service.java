package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity104;
import com.vertexml.generated.repo.GenEntity104Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity104Service {
    private final GenEntity104Repository repo;
    public GenEntity104Service(GenEntity104Repository repo) { this.repo = repo; }
    
    public List<GenEntity104> getAll() { return repo.findAll(); }
    public GenEntity104 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity104 create(GenEntity104 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity104 update(UUID id, GenEntity104 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity104> all = repo.findAll();
        for(GenEntity104 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
