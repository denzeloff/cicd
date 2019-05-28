package pl.wedel.demo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    public DogRepo dogRepo;
    @GetMapping("/dogs")
    public List<Dog> getDog() {
        return dogRepo.findAll();
    }

    @GetMapping
    public String hello() {
        return "Hello world!";
    }
    @PostMapping
    public Dog addDog() {
        return dogRepo.save(new Dog(null, "Piesekaaaa"));
    }


}
