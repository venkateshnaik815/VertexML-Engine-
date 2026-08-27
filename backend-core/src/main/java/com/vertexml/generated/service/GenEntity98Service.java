package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity98;
import com.vertexml.generated.repo.GenEntity98Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity98Service {
    private final GenEntity98Repository repo;
    public GenEntity98Service(GenEntity98Repository repo) { this.repo = repo; }
    
    public List<GenEntity98> getAll() { return repo.findAll(); }
    public GenEntity98 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity98 create(GenEntity98 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity98 update(UUID id, GenEntity98 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity98> all = repo.findAll();
        for(GenEntity98 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
