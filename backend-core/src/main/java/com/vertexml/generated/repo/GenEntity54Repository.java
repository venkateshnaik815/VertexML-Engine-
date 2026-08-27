package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity54;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity54Repository extends JpaRepository<GenEntity54, UUID> {
    List<GenEntity54> findByName(String name);
    List<GenEntity54> findByStatus(String status);
    List<GenEntity54> findByType(String type);
    List<GenEntity54> findByIsActiveTrue();
}
