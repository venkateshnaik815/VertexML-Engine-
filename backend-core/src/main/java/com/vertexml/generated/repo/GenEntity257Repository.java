package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity257;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity257Repository extends JpaRepository<GenEntity257, UUID> {
    List<GenEntity257> findByName(String name);
    List<GenEntity257> findByStatus(String status);
    List<GenEntity257> findByType(String type);
    List<GenEntity257> findByIsActiveTrue();
}
