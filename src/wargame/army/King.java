package wargame.army;

public class King {
    private String name;
    private String motto;

    public King(String name, String motto) {
        this.name = name;
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}
