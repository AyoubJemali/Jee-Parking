
package beans;


public class Login {
     private int id;
  private String username;
  private String password;
  public Login(){};
    public Login(int id,String username, String password) {
        this.id = id;
        this.username=username;
        this.password=password;
    }

   public Login(String username, String password) {
        this.username=username;
        this.password=password;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
         this.username=username;
    }

   public String getpassword() {
        return password;
    }

    public void setPassword(String password) {
         this.password=password;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", username=" + username + ", password=" + password +  '}';
    }
  
}
