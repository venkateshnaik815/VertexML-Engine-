package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity120;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity120Repository extends JpaRepository<GenEntity120, UUID> {
    List<GenEntity120> findByName(String name);
    List<GenEntity120> findByStatus(String status);
    List<GenEntity120> findByType(String type);
    List<GenEntity120> findByIsActiveTrue();
}
