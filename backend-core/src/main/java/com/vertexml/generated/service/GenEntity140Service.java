package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity140;
import com.vertexml.generated.repo.GenEntity140Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity140Service {
    private final GenEntity140Repository repo;
    public GenEntity140Service(GenEntity140Repository repo) { this.repo = repo; }
    
    public List<GenEntity140> getAll() { return repo.findAll(); }
    public GenEntity140 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity140 create(GenEntity140 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity140 update(UUID id, GenEntity140 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity140> all = repo.findAll();
        for(GenEntity140 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
