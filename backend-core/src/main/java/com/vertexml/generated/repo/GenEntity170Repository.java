package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity170;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity170Repository extends JpaRepository<GenEntity170, UUID> {
    List<GenEntity170> findByName(String name);
    List<GenEntity170> findByStatus(String status);
    List<GenEntity170> findByType(String type);
    List<GenEntity170> findByIsActiveTrue();
}
