package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity65;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity65Repository extends JpaRepository<GenEntity65, UUID> {
    List<GenEntity65> findByName(String name);
    List<GenEntity65> findByStatus(String status);
    List<GenEntity65> findByType(String type);
    List<GenEntity65> findByIsActiveTrue();
}
