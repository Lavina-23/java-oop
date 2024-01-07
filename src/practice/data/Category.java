package src.practice.data;

public class Category {
    private String id; // it's private, so another class can't just use it
    // public String id; -> another class can use it
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

}
