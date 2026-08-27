package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity130;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity130Repository extends JpaRepository<GenEntity130, UUID> {
    List<GenEntity130> findByName(String name);
    List<GenEntity130> findByStatus(String status);
    List<GenEntity130> findByType(String type);
    List<GenEntity130> findByIsActiveTrue();
}
