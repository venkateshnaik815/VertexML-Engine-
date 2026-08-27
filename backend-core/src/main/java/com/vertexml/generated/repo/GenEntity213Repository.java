package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity213;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity213Repository extends JpaRepository<GenEntity213, UUID> {
    List<GenEntity213> findByName(String name);
    List<GenEntity213> findByStatus(String status);
    List<GenEntity213> findByType(String type);
    List<GenEntity213> findByIsActiveTrue();
}
