package tacos.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tacos.repositories.TestRepository;

@Service
@AllArgsConstructor
public class TestService {

//    @Autowired
//    TestRepository testRepository;

    private final TestRepository testRepository;

    public Integer negateNumber() {
        return testRepository.getData() * -1;
    }
}
