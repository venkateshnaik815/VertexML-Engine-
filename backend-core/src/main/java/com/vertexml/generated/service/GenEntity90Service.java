package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity90;
import com.vertexml.generated.repo.GenEntity90Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity90Service {
    private final GenEntity90Repository repo;
    public GenEntity90Service(GenEntity90Repository repo) { this.repo = repo; }
    
    public List<GenEntity90> getAll() { return repo.findAll(); }
    public GenEntity90 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity90 create(GenEntity90 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity90 update(UUID id, GenEntity90 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity90> all = repo.findAll();
        for(GenEntity90 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
