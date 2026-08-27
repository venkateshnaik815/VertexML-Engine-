package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity272;
import com.vertexml.generated.repo.GenEntity272Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity272Service {
    private final GenEntity272Repository repo;
    public GenEntity272Service(GenEntity272Repository repo) { this.repo = repo; }
    
    public List<GenEntity272> getAll() { return repo.findAll(); }
    public GenEntity272 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity272 create(GenEntity272 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity272 update(UUID id, GenEntity272 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity272> all = repo.findAll();
        for(GenEntity272 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
