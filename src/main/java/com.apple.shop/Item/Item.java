package jinuk.project3.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String title;
    private Integer price;

}


///////////////////////////////
package jinuk.pj1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

@Entity
@ToString
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public Integer price;
}

/////////////////////////////
@Entity
@ToString
@Getter
@Setter
@Table(indexes = @Index(columList = "title", name = "작명"))  
public class Item {
  @Id @GeneratedValue(stragegy = GenerationType.IDENTITY)
  public Long id;
  
  public String title;
  public Integer price;
}

//////////////////////////////////



  public void setTitle(String title) {
    만약에 title변수에 이상한 긴 문자 넣으려고 하면 차단하기~~
    this.title = title;
  }
  

