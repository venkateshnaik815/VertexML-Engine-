package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity116;
import com.vertexml.generated.repo.GenEntity116Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity116Service {
    private final GenEntity116Repository repo;
    public GenEntity116Service(GenEntity116Repository repo) { this.repo = repo; }
    
    public List<GenEntity116> getAll() { return repo.findAll(); }
    public GenEntity116 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity116 create(GenEntity116 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity116 update(UUID id, GenEntity116 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity116> all = repo.findAll();
        for(GenEntity116 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
