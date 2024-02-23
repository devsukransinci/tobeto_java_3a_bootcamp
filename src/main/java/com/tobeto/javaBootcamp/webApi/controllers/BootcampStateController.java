package com.tobeto.javaBootcamp.webApi.controllers;
import com.tobeto.javaBootcamp.business.abstracts.BootcampStateService;
import com.tobeto.javaBootcamp.business.requests.create.bootcampState.CreateBootcampStateRequest;
import com.tobeto.javaBootcamp.business.response.create.BootcampState.CreateBootcampStateResponse;
import com.tobeto.javaBootcamp.business.response.get.BootcampState.GetAllBootcampStateResponse;
import com.tobeto.javaBootcamp.business.response.get.BootcampState.GetBootcampStateResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/bootcampState")
@AllArgsConstructor
public class BootcampStateController {
    private BootcampStateService bootcampStateService;
    @PostMapping()
    public CreateBootcampStateResponse add(@RequestBody CreateBootcampStateRequest request){
        CreateBootcampStateResponse result =bootcampStateService.add(request);
        return  result;

    }
    @GetMapping("getall")
    public List<GetAllBootcampStateResponse> getAll(){
        return bootcampStateService.getAllBootcampState();
    }

    @GetMapping("getbyId/{id}")
    public GetBootcampStateResponse getById(@PathVariable int id){
        return bootcampStateService.getById(id);
    }
}
