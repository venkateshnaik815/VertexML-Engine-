package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity111;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity111Repository extends JpaRepository<GenEntity111, UUID> {
    List<GenEntity111> findByName(String name);
    List<GenEntity111> findByStatus(String status);
    List<GenEntity111> findByType(String type);
    List<GenEntity111> findByIsActiveTrue();
}
