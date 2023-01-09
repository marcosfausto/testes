package tests;

import java.util.*;

public abstract class  Teste2 {

    public Integer id;

    public Teste2(Integer id) {
        this.id = id;
    }

    public Teste2() {
    }

    public static  void bla() {} ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teste2 teste2 = (Teste2) o;
        return Objects.equals(id, teste2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
