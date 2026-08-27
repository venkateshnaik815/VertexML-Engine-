package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity134;
import com.vertexml.generated.repo.GenEntity134Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity134Service {
    private final GenEntity134Repository repo;
    public GenEntity134Service(GenEntity134Repository repo) { this.repo = repo; }
    
    public List<GenEntity134> getAll() { return repo.findAll(); }
    public GenEntity134 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity134 create(GenEntity134 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity134 update(UUID id, GenEntity134 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity134> all = repo.findAll();
        for(GenEntity134 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
