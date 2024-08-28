@RequiredArgsConstructor
@Service
public class MyUserDetailsService implements UserDetailsService {

  private final MemberRepository memberRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    var result = memberRepository.findByUsername(username);
    if (result.isEmpty()){
      throw new UsernameNotFoundExeception("그런아이디 없음");
    }
    var user = result.get();

    List<GrantedAutority> autorities = new ArrayList<>();
    authorities.add(new SimpleGrantedAuthority("일반유저"));
    var a = new CustomUser(user.getUsername(), user.getPassword(), authorities);
    a.displayName = user.getDisplayName();
    return a;
  } 

}



/////////////////////////////////



