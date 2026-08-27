package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity71;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity71Repository extends JpaRepository<GenEntity71, UUID> {
    List<GenEntity71> findByName(String name);
    List<GenEntity71> findByStatus(String status);
    List<GenEntity71> findByType(String type);
    List<GenEntity71> findByIsActiveTrue();
}
