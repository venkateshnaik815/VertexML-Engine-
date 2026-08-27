package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity173;
import com.vertexml.generated.repo.GenEntity173Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity173Service {
    private final GenEntity173Repository repo;
    public GenEntity173Service(GenEntity173Repository repo) { this.repo = repo; }
    
    public List<GenEntity173> getAll() { return repo.findAll(); }
    public GenEntity173 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity173 create(GenEntity173 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity173 update(UUID id, GenEntity173 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity173> all = repo.findAll();
        for(GenEntity173 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
