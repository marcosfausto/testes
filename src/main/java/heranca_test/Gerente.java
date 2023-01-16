package heranca_test;

public class Gerente implements FuncionarioDoBanco{

    @Override
    public void dizAlgo() {
        System.out.println("trabalha cabrao!");
    }

    public void dizAlgo(String str) {
        System.out.println(str);
    }

}
