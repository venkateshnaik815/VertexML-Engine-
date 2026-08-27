package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity126;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity126Repository extends JpaRepository<GenEntity126, UUID> {
    List<GenEntity126> findByName(String name);
    List<GenEntity126> findByStatus(String status);
    List<GenEntity126> findByType(String type);
    List<GenEntity126> findByIsActiveTrue();
}
