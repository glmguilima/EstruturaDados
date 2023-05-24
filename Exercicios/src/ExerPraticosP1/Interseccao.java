package ExerPraticosP1;

import java.util.ArrayList;
import java.util.List;

// exercicio 1
public class Interseccao {
    public static int[] getIntersection(int[] vet1, int[] vet2) {
        List<Integer> intersecaoLista = new ArrayList<>();

        for (int i = 0; i < vet1.length; i++) {
            int num = vet1[i];

            for (int j = 0; j < vet2.length; j++) {
                if (num == vet2[j]) {
                    intersecaoLista.add(num);
                    break;
                }
            }
        }

        int[] intersectionArr = new int[intersecaoLista.size()];
        for (int i = 0; i < intersecaoLista.size(); i++) {
            intersectionArr[i] = intersecaoLista.get(i);
        }
        return intersectionArr;
    }
}
