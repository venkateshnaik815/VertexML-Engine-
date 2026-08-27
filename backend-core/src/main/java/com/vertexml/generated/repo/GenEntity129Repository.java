package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity129;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity129Repository extends JpaRepository<GenEntity129, UUID> {
    List<GenEntity129> findByName(String name);
    List<GenEntity129> findByStatus(String status);
    List<GenEntity129> findByType(String type);
    List<GenEntity129> findByIsActiveTrue();
}
