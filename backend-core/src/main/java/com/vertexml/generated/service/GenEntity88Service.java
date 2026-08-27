package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity88;
import com.vertexml.generated.repo.GenEntity88Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity88Service {
    private final GenEntity88Repository repo;
    public GenEntity88Service(GenEntity88Repository repo) { this.repo = repo; }
    
    public List<GenEntity88> getAll() { return repo.findAll(); }
    public GenEntity88 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity88 create(GenEntity88 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity88 update(UUID id, GenEntity88 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity88> all = repo.findAll();
        for(GenEntity88 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
