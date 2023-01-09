package streams;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class User implements Comparable {

    @EqualsAndHashCode.Include()
    private Integer id;
    private String nome;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
//    private String email;
//    private String address;
}
