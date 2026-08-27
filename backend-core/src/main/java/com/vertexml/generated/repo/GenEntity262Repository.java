package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity262;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity262Repository extends JpaRepository<GenEntity262, UUID> {
    List<GenEntity262> findByName(String name);
    List<GenEntity262> findByStatus(String status);
    List<GenEntity262> findByType(String type);
    List<GenEntity262> findByIsActiveTrue();
}
