package tacos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tacos.repositories.TestRepository;
import tacos.services.TestService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@ExtendWith(SpringExtension.class)
@ExtendWith(MockitoExtension.class)
public class ServiceTest {
    @Mock
    TestRepository repository;
//
    @InjectMocks
TestService testService;


//    @BeforeEach
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//    }

    @Test
    public void testNegateNumber() {
        //TestService testService = new TestService(repository);
        when(repository.getData()).thenReturn(5);
        int res = testService.negateNumber();
        assertEquals(-5, res);
    }
}
