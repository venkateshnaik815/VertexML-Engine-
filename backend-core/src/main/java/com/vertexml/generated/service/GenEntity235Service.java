package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity235;
import com.vertexml.generated.repo.GenEntity235Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity235Service {
    private final GenEntity235Repository repo;
    public GenEntity235Service(GenEntity235Repository repo) { this.repo = repo; }
    
    public List<GenEntity235> getAll() { return repo.findAll(); }
    public GenEntity235 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity235 create(GenEntity235 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity235 update(UUID id, GenEntity235 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity235> all = repo.findAll();
        for(GenEntity235 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
