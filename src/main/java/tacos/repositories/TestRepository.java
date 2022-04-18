package tacos.repositories;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class TestRepository {
    public Integer getData() {
        return new Random().nextInt(10);
    }
}
