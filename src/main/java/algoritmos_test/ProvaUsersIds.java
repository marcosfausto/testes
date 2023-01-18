package algoritmos_test;


import java.util.HashMap;
import java.util.Map;

public class ProvaUsersIds {

    //TODO
    // Vai receber um Variable Arguments de maps contendo a chave String e o value UserStats
    // a chave é o ID que tem ser parsable para LONG
    // a key pode ser nula, assim como pode ter chaves que não são numeros, caso sejam, tem q ser descartados
    // o value UserStats possui um único campo chamado visitCount que é um Option<Long>
    // o value tb pode vir vazio, assim como nulo, caso sejam,  tem q ser descartados
    // não lembro se tinha mais verificações...
    public static void main(String[] args) {


    }

    static Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long,Long> result = new HashMap<>();
        for(Map<String, UserStats> map: visits) {
            for (Map.Entry<String, UserStats> entry : map.entrySet()) {
                System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
                if(isNumeric(entry.getKey()) && entry.getValue()!=null) {
                    if(entry.getValue().getVisitCount().isPresent() && !String.valueOf(entry.getValue().getVisitCount().get()).equals("") && !String.valueOf(entry.getValue().getVisitCount().get()).equals(" ")) {
                        result.put(Long.valueOf(entry.getKey()), entry.getValue().getVisitCount().get());
                    }
                }
            }
        }
        return result;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            long d = Long.parseLong(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
