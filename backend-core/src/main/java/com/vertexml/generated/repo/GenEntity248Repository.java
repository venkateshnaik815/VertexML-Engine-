package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity248;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity248Repository extends JpaRepository<GenEntity248, UUID> {
    List<GenEntity248> findByName(String name);
    List<GenEntity248> findByStatus(String status);
    List<GenEntity248> findByType(String type);
    List<GenEntity248> findByIsActiveTrue();
}
