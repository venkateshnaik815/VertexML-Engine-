package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity292;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity292Repository extends JpaRepository<GenEntity292, UUID> {
    List<GenEntity292> findByName(String name);
    List<GenEntity292> findByStatus(String status);
    List<GenEntity292> findByType(String type);
    List<GenEntity292> findByIsActiveTrue();
}
