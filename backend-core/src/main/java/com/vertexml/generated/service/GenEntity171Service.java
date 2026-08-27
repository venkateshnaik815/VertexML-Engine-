package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity171;
import com.vertexml.generated.repo.GenEntity171Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity171Service {
    private final GenEntity171Repository repo;
    public GenEntity171Service(GenEntity171Repository repo) { this.repo = repo; }
    
    public List<GenEntity171> getAll() { return repo.findAll(); }
    public GenEntity171 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity171 create(GenEntity171 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity171 update(UUID id, GenEntity171 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity171> all = repo.findAll();
        for(GenEntity171 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
