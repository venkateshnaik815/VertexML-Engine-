package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity44;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity44Repository extends JpaRepository<GenEntity44, UUID> {
    List<GenEntity44> findByName(String name);
    List<GenEntity44> findByStatus(String status);
    List<GenEntity44> findByType(String type);
    List<GenEntity44> findByIsActiveTrue();
}
