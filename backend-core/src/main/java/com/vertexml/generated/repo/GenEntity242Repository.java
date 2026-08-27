package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity242;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity242Repository extends JpaRepository<GenEntity242, UUID> {
    List<GenEntity242> findByName(String name);
    List<GenEntity242> findByStatus(String status);
    List<GenEntity242> findByType(String type);
    List<GenEntity242> findByIsActiveTrue();
}
