
package beans;

public class Section {
     private int id;
    private String ref;

    public Section(int id, String ref) {
        this.id = id;
        this.ref = ref;
    }

    public Section(String ref) {
        this.ref = ref;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setref(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Section{" + "id=" + id + ", code=" + ref + '}';
    }
    
}


