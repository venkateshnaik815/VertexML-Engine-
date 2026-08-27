package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity150;
import com.vertexml.generated.repo.GenEntity150Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity150Service {
    private final GenEntity150Repository repo;
    public GenEntity150Service(GenEntity150Repository repo) { this.repo = repo; }
    
    public List<GenEntity150> getAll() { return repo.findAll(); }
    public GenEntity150 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity150 create(GenEntity150 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity150 update(UUID id, GenEntity150 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity150> all = repo.findAll();
        for(GenEntity150 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
