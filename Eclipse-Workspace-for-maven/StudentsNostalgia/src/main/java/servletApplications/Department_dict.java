package servletApplications;

import java.util.HashMap;
import java.util.Map;

public class Department_dict {
    private Map<Integer, String> map;

    public Department_dict() {
        map = new HashMap<>();
        map.put(1, "AI&DS");
        map.put(2, "CSE");
        map.put(3, "ENTC");
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}
