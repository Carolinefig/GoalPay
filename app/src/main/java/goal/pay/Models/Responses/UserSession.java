package goal.pay.Models.Responses;

public class UserSession {
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String vid) {
        id = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String vname) {
        name = vname;
    }

    private String name;
}
