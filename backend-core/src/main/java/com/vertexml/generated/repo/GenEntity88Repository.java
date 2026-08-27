package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity88;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity88Repository extends JpaRepository<GenEntity88, UUID> {
    List<GenEntity88> findByName(String name);
    List<GenEntity88> findByStatus(String status);
    List<GenEntity88> findByType(String type);
    List<GenEntity88> findByIsActiveTrue();
}
