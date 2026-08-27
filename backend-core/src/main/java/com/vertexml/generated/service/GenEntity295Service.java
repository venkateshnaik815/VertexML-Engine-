package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity295;
import com.vertexml.generated.repo.GenEntity295Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity295Service {
    private final GenEntity295Repository repo;
    public GenEntity295Service(GenEntity295Repository repo) { this.repo = repo; }
    
    public List<GenEntity295> getAll() { return repo.findAll(); }
    public GenEntity295 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity295 create(GenEntity295 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity295 update(UUID id, GenEntity295 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity295> all = repo.findAll();
        for(GenEntity295 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
