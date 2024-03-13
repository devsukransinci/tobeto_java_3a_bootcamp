package com.tobeto.javaBootcamp.webApi.controllers;

import com.tobeto.javaBootcamp.business.abstracts.BlackListService;
import com.tobeto.javaBootcamp.business.requests.create.blackList.CreateBlackListRequest;
import com.tobeto.javaBootcamp.core.utilities.paging.PageDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blacklists")
public class BlackListController extends BaseController {
    private final BlackListService blackListService;

    @Autowired
    public BlackListController(BlackListService blacklistService) {
        this.blackListService = blacklistService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addBlackList(@RequestBody @Valid CreateBlackListRequest request) {
        return handleDataResult(blackListService.add(request));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getBlackListById(@PathVariable int id) {
        
        return handleDataResult(blackListService.getById(id));
    }

    

    @GetMapping("/get/all")
    public ResponseEntity<?> getAllBlackLists() {
        return handleDataResult(blackListService.getAll());
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateBlackList(@RequestBody CreateBlackListRequest request) {
        return handleResult(blackListService.update(request));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBlackList(@PathVariable int id) {
        return handleResult(blackListService.delete(id));
    }
    @GetMapping("/sort")
    public ResponseEntity<?> getAllPage(@RequestBody PageDto pageDto) {
        return handleResult(blackListService.getAllPage(pageDto));
    }
}
