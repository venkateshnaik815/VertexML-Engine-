package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity55;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity55Repository extends JpaRepository<EnterpriseBillingEntity55, UUID> {
    List<EnterpriseBillingEntity55> findByName(String name);
    List<EnterpriseBillingEntity55> findByStatus(String status);
    List<EnterpriseBillingEntity55> findByType(String type);
    List<EnterpriseBillingEntity55> findByIsActiveTrue();
}
