package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity195;
import com.vertexml.generated.repo.GenEntity195Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity195Service {
    private final GenEntity195Repository repo;
    public GenEntity195Service(GenEntity195Repository repo) { this.repo = repo; }
    
    public List<GenEntity195> getAll() { return repo.findAll(); }
    public GenEntity195 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity195 create(GenEntity195 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity195 update(UUID id, GenEntity195 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity195> all = repo.findAll();
        for(GenEntity195 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
