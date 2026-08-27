package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity232;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity232Repository extends JpaRepository<GenEntity232, UUID> {
    List<GenEntity232> findByName(String name);
    List<GenEntity232> findByStatus(String status);
    List<GenEntity232> findByType(String type);
    List<GenEntity232> findByIsActiveTrue();
}
