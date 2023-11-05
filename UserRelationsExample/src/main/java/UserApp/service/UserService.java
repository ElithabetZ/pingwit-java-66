package UserApp.service;

import UserApp.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import UserApp.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Oppps"));
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
