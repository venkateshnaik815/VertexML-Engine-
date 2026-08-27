package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity132;
import com.vertexml.generated.repo.GenEntity132Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity132Service {
    private final GenEntity132Repository repo;
    public GenEntity132Service(GenEntity132Repository repo) { this.repo = repo; }
    
    public List<GenEntity132> getAll() { return repo.findAll(); }
    public GenEntity132 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity132 create(GenEntity132 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity132 update(UUID id, GenEntity132 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity132> all = repo.findAll();
        for(GenEntity132 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
