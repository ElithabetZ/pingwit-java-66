package userApp.service;

import userApp.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import userApp.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /*
        Сделай так: возвращай тут Optional<User>
        В котроллере обрабатывай данную ситуацию: если empty, то возвращай код 404 (испаользуй ResponseEntity), иначе - 200 (OK)
     */
    public User findById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Don't find such user "+id));
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
