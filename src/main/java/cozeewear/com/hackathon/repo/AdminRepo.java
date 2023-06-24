package cozeewear.com.hackathon.repo;

import cozeewear.com.hackathon.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepo extends JpaRepository<cozeewear.com.hackathon.model.Admin, String> {

}
