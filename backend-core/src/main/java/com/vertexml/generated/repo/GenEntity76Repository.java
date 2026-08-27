package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity76;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity76Repository extends JpaRepository<GenEntity76, UUID> {
    List<GenEntity76> findByName(String name);
    List<GenEntity76> findByStatus(String status);
    List<GenEntity76> findByType(String type);
    List<GenEntity76> findByIsActiveTrue();
}
