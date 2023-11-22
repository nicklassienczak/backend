package ita3.car.config;

import ita3.car.entity.Car;
import ita3.car.entity.Members;
import ita3.car.repository.ICarRepository;
import ita3.car.repository.IMembersRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DeveloperData implements ApplicationRunner {

    // Denne klasse er jeres legeplads. Vi bruger den til at lave de første øvelser
    // og til at teste ting af inden vi putter dem over i et "rigtigt projekt"

    ICarRepository carRepo;
    IMembersRepository memberRepo;
    public DeveloperData(ICarRepository carRepo, IMembersRepository memberRepo) {
        this.carRepo = carRepo;
        this.memberRepo = memberRepo;
    }




    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("I was Called!");
        carRepo.save(new Car("Tesla", "X", 200, 10));
        carRepo.save(new Car("Ferrari", "488 GTB", 1000.0, 15));
        carRepo.save(new Car("Lamborghini", "Aventador", 1500.0, 20));
        carRepo.save(new Car("Porsche", "911 Turbo", 900.0, 12));
        carRepo.save(new Car("Aston Martin", "DB11", 1200.0, 18));
        carRepo.save(new Car("Mercedes-Benz", "S-Class", 800.0, 10));
        carRepo.save(new Car("BMW", "M5", 850.0, 11));
        carRepo.save(new Car("Audi", "R8", 1100.0, 16));
        carRepo.save(new Car("Jaguar", "F-Type", 1000.0, 15));
        carRepo.save(new Car("Lexus", "LC 500", 950.0, 14));
        carRepo.save(new Car("Bentley", "Continental GT", 1600.0, 25));

        memberRepo.save(new Members("nicklassienczak", "password123", "nicklas-sk@hotmail.com", "Nicklas", "Knudsen", "Stærevej 66", "København NV", "2400", true, 1));
        memberRepo.save(new Members("alice123", "password123", "alice@example.com", "Alice", "Johnson", "123 Elm Street", "Springfield", "12345", true, 4));
        memberRepo.save(new Members("bob456", "password456", "bob@example.com", "Bob", "Smith", "456 Oak Avenue", "Riverside", "54321", true, 64));
        memberRepo.save(new Members("carol789", "password789", "carol@example.com", "Carol", "Williams", "789 Maple Road", "Palmville", "67890", true, 23));
        memberRepo.save(new Members("david101", "password101", "david@example.com", "David", "Brown", "101 Pine Lane", "Hillside", "11223", true, 3));
        memberRepo.save(new Members("emma202", "password202", "emma@example.com", "Emma", "Davis", "202 Cedar Drive", "Lakeview", "44556", true, 634));
        memberRepo.save(new Members("frank303", "password303", "frank@example.com", "Frank", "Jones", "303 Birch Street", "Meadowville", "99887", true, 642));
        memberRepo.save(new Members("grace404", "password404", "grace@example.com", "Grace", "Taylor", "404 Willow Lane", "Sunset", "33221", true, 245));
        memberRepo.save(new Members("henry505", "password505", "henry@example.com", "Henry", "Wilson", "505 Redwood Road", "Hometown", "77889", true, 87));
        memberRepo.save(new Members("isabel606", "password606", "isabel@example.com", "Isabel", "Martin", "606 Cedar Avenue", "Harbor City", "11234", true, 217));
        memberRepo.save(new Members("jack707", "password707", "jack@example.com", "Jack", "Anderson", "707 Elm Court", "Seaville", "55555", true, 79));


    }
}
