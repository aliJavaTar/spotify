package com.spotify.inventory.storeroom.presentation;

import com.spotify.inventory.storeroom.domin.StoreRoom;
import com.spotify.inventory.storeroom.service.StoreRoomService;
import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storeRooms")
public class StoreRoomController {
    private final StoreRoomService service;

    public StoreRoomController(StoreRoomService service) {
        this.service = service;
    }

    @PostMapping("api-v1-sto")
    public ResponseEntity<StoreRoom> save(@RequestBody @Valid StoreRoom storeRoom) {
        return new ResponseEntity<>(service.save(storeRoom), HttpStatus.CREATED);
    }
}
