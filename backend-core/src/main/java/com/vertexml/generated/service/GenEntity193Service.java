package com.vertexml.generated.service;
import com.vertexml.generated.domain.GenEntity193;
import com.vertexml.generated.repo.GenEntity193Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class GenEntity193Service {
    private final GenEntity193Repository repo;
    public GenEntity193Service(GenEntity193Repository repo) { this.repo = repo; }
    
    public List<GenEntity193> getAll() { return repo.findAll(); }
    public GenEntity193 getById(UUID id) { return repo.findById(id).orElse(null); }
    public GenEntity193 create(GenEntity193 entity) {
        entity.processMetrics();
        return repo.save(entity);
    }
    public GenEntity193 update(UUID id, GenEntity193 entity) {
        if(repo.existsById(id)) {
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }
        return null;
    }
    public void delete(UUID id) { repo.deleteById(id); }
    public void bulkProcess() {
        List<GenEntity193> all = repo.findAll();
        for(GenEntity193 e : all) {
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }
        repo.saveAll(all);
    }
}
