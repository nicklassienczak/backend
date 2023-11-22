package ita3.car.repository;


import ita3.car.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMembersRepository extends JpaRepository<Members, String> {


}
