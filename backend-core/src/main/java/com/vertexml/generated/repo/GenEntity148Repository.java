package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity148;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity148Repository extends JpaRepository<GenEntity148, UUID> {
    List<GenEntity148> findByName(String name);
    List<GenEntity148> findByStatus(String status);
    List<GenEntity148> findByType(String type);
    List<GenEntity148> findByIsActiveTrue();
}
