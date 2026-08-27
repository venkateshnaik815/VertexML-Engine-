package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity34;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity34Repository extends JpaRepository<GenEntity34, UUID> {
    List<GenEntity34> findByName(String name);
    List<GenEntity34> findByStatus(String status);
    List<GenEntity34> findByType(String type);
    List<GenEntity34> findByIsActiveTrue();
}
