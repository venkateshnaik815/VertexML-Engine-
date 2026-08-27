package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity129;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity129Repository extends JpaRepository<EnterpriseBillingEntity129, UUID> {
    List<EnterpriseBillingEntity129> findByName(String name);
    List<EnterpriseBillingEntity129> findByStatus(String status);
    List<EnterpriseBillingEntity129> findByType(String type);
    List<EnterpriseBillingEntity129> findByIsActiveTrue();
}
