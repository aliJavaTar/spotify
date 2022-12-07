package com.spotify.inventory.storeroom.infrastructure;

import com.spotify.inventory.storeroom.domin.StoreRoom;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MySqlStoreRoomRepository {
    private final StoreRoomRepository repository;

    public MySqlStoreRoomRepository(StoreRoomRepository storeRoomRepository) {
        this.repository = storeRoomRepository;
    }

    public Optional<StoreRoom> save(StoreRoom storeRoom) {
        return Optional.of(repository.save(storeRoom));
    }
}
