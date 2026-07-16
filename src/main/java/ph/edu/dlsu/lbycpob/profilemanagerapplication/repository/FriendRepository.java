package ph.edu.dlsu.lbycpob.profilemanagerapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ph.edu.dlsu.lbycpob.profilemanagerapplication.model.Friend;

import java.util.List;
import java.util.UUID;

public interface FriendRepository extends JpaRepository<Friend, UUID> {
}
