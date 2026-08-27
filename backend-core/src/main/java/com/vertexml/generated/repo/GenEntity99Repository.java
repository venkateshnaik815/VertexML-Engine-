package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity99;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity99Repository extends JpaRepository<GenEntity99, UUID> {
    List<GenEntity99> findByName(String name);
    List<GenEntity99> findByStatus(String status);
    List<GenEntity99> findByType(String type);
    List<GenEntity99> findByIsActiveTrue();
}
