package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity202;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity202Repository extends JpaRepository<GenEntity202, UUID> {
    List<GenEntity202> findByName(String name);
    List<GenEntity202> findByStatus(String status);
    List<GenEntity202> findByType(String type);
    List<GenEntity202> findByIsActiveTrue();
}
