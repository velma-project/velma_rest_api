package io.github.shymega.repaircafe.api.db.repositories;

import io.github.shymega.repaircafe.api.models.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepairRepository extends JpaRepository<Repair, UUID> {
}