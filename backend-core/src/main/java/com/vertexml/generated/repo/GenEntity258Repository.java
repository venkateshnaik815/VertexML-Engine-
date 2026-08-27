package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity258;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity258Repository extends JpaRepository<GenEntity258, UUID> {
    List<GenEntity258> findByName(String name);
    List<GenEntity258> findByStatus(String status);
    List<GenEntity258> findByType(String type);
    List<GenEntity258> findByIsActiveTrue();
}
