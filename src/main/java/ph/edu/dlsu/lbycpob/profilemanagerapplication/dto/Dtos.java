package ph.edu.dlsu.lbycpob.profilemanagerapplication.dto;

import ph.edu.dlsu.lbycpob.profilemanager.model.Profile;

import java.util.List;
import java.util.UUID;

public class Dtos {

    private Dtos() {
    }

    /** Left-panel list row: id, name, picture only. */
    public record ProfileListItem(UUID id, String name, String picture) {
        public static ProfileListItem of(Profile p) {
            return new ProfileListItem(p.getId(), p.getName(), p.getPicture());
        }
    }
