package com.coworkingspace.spaceservice.controller;


import com.coworkingspace.spaceservice.dto.DeskDto;
import com.coworkingspace.spaceservice.service.DeskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/desks")
@Slf4j
@RequiredArgsConstructor
public class DeskController {

    private  final DeskService deskService;
    @GetMapping
    public ResponseEntity<List<DeskDto>>getAllDesks(){
        List<DeskDto>desks = deskService.getAllDesks();
        return ResponseEntity.ok(desks);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<DeskDto>getDeskById(@PathVariable Long id){
        DeskDto desk = deskService.getDeskById(id);

        return ResponseEntity.ok(desk);
    }


}
