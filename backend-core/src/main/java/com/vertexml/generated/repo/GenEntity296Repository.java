package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity296;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity296Repository extends JpaRepository<GenEntity296, UUID> {
    List<GenEntity296> findByName(String name);
    List<GenEntity296> findByStatus(String status);
    List<GenEntity296> findByType(String type);
    List<GenEntity296> findByIsActiveTrue();
}
