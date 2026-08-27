package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity223;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity223Repository extends JpaRepository<GenEntity223, UUID> {
    List<GenEntity223> findByName(String name);
    List<GenEntity223> findByStatus(String status);
    List<GenEntity223> findByType(String type);
    List<GenEntity223> findByIsActiveTrue();
}
