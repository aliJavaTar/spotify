package com.spotify.inventory.storeroom.service;

import com.spotify.inventory.storeroom.domin.StoreRoom;
import com.spotify.inventory.storeroom.infrastructure.MySqlStoreRoomRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultStoreRoomService implements StoreRoomService {
    private final MySqlStoreRoomRepository storeRoomRepository;

    public DefaultStoreRoomService(MySqlStoreRoomRepository storeRoomRepository) {
        this.storeRoomRepository = storeRoomRepository;
    }

    @Override
    public StoreRoom save(StoreRoom storeroom) {
        return storeRoomRepository.save(storeroom)
                .orElseThrow(() -> new RuntimeException(""));
    }
}
