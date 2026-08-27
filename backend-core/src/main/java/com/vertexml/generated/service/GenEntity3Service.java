package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity3;
import com.vertexml.generated.repo.GenEntity3Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity3Service {
    private final GenEntity3Repository repo;
    public GenEntity3Service(GenEntity3Repository repo) { this.repo = repo; }
    
    public List<GenEntity3> getAll() { return repo.findAll(); }
    public GenEntity3 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity3 create(GenEntity3 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity3 update(UUID id, GenEntity3 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity3> all = repo.findAll();
        for(GenEntity3 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
