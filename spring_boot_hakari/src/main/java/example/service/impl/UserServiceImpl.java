package example.service.impl;

import com.google.common.collect.Lists;
import example.model.User;
import example.repository.UserRepository;
import example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {

        return Lists.newArrayList(userRepository.findAll());
    }

}
