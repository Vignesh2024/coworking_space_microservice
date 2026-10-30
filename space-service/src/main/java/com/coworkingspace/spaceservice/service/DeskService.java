package com.coworkingspace.spaceservice.service;

import com.coworkingspace.spaceservice.dto.DeskDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeskService {

    List<DeskDto>getAllDesks();

    DeskDto getDeskById(Long id);

}
