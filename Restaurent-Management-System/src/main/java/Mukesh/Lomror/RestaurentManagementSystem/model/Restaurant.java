package Mukesh.Lomror.RestaurentManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private int restId;
    private String restName;
    private String restAddress;
    private int restStaff;
    private String restSpecial;
}
