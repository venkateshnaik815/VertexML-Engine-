package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity67;
import com.vertexml.generated.repo.GenEntity67Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity67Service {
    private final GenEntity67Repository repo;
    public GenEntity67Service(GenEntity67Repository repo) { this.repo = repo; }
    
    public List<GenEntity67> getAll() { return repo.findAll(); }
    public GenEntity67 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity67 create(GenEntity67 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity67 update(UUID id, GenEntity67 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity67> all = repo.findAll();
        for(GenEntity67 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
