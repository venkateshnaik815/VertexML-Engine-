package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity185;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity185Repository extends JpaRepository<GenEntity185, UUID> {
    List<GenEntity185> findByName(String name);
    List<GenEntity185> findByStatus(String status);
    List<GenEntity185> findByType(String type);
    List<GenEntity185> findByIsActiveTrue();
}
