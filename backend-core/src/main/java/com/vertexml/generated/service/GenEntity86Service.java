package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity86;
import com.vertexml.generated.repo.GenEntity86Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity86Service {
    private final GenEntity86Repository repo;
    public GenEntity86Service(GenEntity86Repository repo) { this.repo = repo; }
    
    public List<GenEntity86> getAll() { return repo.findAll(); }
    public GenEntity86 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity86 create(GenEntity86 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity86 update(UUID id, GenEntity86 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity86> all = repo.findAll();
        for(GenEntity86 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
