public class CustomUser extends User {
  public String displayName;
  public CustomUser(
    String username,
    String password,
    Collection<? extends GrantedAuthority> authorities
  ) {
    super(username, password, authorities);
  }
  
}
