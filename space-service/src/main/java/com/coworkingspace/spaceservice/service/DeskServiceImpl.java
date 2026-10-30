package com.coworkingspace.spaceservice.service;


import com.coworkingspace.spaceservice.dto.DeskDto;
import com.coworkingspace.spaceservice.entity.Desk;
import com.coworkingspace.spaceservice.repository.DeskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class DeskServiceImpl  implements  DeskService{

    private final DeskRepository deskRepository;

    private final ModelMapper modelMapper;


    @Override
    public List<DeskDto> getAllDesks() {
        log.info("Fetching all desks");
        List<Desk>desks = deskRepository.findAll();

        return desks.stream()
                .map(desk->modelMapper.map(desk,DeskDto.class))
                .toList();
    }

    @Override
    public DeskDto getDeskById(Long id) {
        log.info("Fetching desk with ID:{}",id);

        Optional<Desk>desk = deskRepository.findById(id);

        return desk.map(item->modelMapper.map(item,DeskDto.class))
                .orElseThrow(()->new RuntimeException("Desk not found"));
    }
}
