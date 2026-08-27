package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity108;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity108Repository extends JpaRepository<GenEntity108, UUID> {
    List<GenEntity108> findByName(String name);
    List<GenEntity108> findByStatus(String status);
    List<GenEntity108> findByType(String type);
    List<GenEntity108> findByIsActiveTrue();
}
