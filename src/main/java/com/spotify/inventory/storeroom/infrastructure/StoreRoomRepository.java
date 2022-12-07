package com.spotify.inventory.storeroom.infrastructure;

import com.spotify.inventory.storeroom.domin.StoreRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRoomRepository extends JpaRepository<StoreRoom, Long> {
}
