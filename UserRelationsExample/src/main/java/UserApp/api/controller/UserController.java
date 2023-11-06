package UserApp.api.controller;

import UserApp.api.converter.UserConverter;
import UserApp.api.converter.UserResponseConvrter;
import UserApp.dto.UserRequestDto;
import UserApp.dto.UserResponseDto;
import UserApp.entity.User;
import org.springframework.web.bind.annotation.*;
import UserApp.service.UserService;

/*
    Не вижу в дз подготовленных json.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserResponseConvrter userResponseConvrter;
    private final UserConverter userConverter;

    public UserController(UserService userService, UserResponseConvrter userResponseConvrter, UserConverter userConverter){
        this.userService = userService;
        this.userResponseConvrter = userResponseConvrter;
        this.userConverter = userConverter;
    }

    @GetMapping("/{id}")
    public UserResponseDto getById(@PathVariable Long id){
        User user = userService.findById(id);
        return userResponseConvrter.toDto(user);
    }

    @PostMapping
    public UserResponseDto save(@RequestBody UserRequestDto dto){
        User model = userConverter.toModel(dto);
        User saved = userService.save(model);
        return userResponseConvrter.toDto(saved);
    }
}
