package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity131;
import com.vertexml.generated.repo.GenEntity131Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity131Service {
    private final GenEntity131Repository repo;
    public GenEntity131Service(GenEntity131Repository repo) { this.repo = repo; }
    
    public List<GenEntity131> getAll() { return repo.findAll(); }
    public GenEntity131 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity131 create(GenEntity131 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity131 update(UUID id, GenEntity131 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity131> all = repo.findAll();
        for(GenEntity131 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
