package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity275;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity275Repository extends JpaRepository<GenEntity275, UUID> {
    List<GenEntity275> findByName(String name);
    List<GenEntity275> findByStatus(String status);
    List<GenEntity275> findByType(String type);
    List<GenEntity275> findByIsActiveTrue();
}
