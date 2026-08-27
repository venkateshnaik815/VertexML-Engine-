package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity128;
import com.vertexml.generated.repo.GenEntity128Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity128Service {
    private final GenEntity128Repository repo;
    public GenEntity128Service(GenEntity128Repository repo) { this.repo = repo; }
    
    public List<GenEntity128> getAll() { return repo.findAll(); }
    public GenEntity128 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity128 create(GenEntity128 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity128 update(UUID id, GenEntity128 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity128> all = repo.findAll();
        for(GenEntity128 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
