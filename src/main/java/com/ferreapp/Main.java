package com.ferreapp;

import java.util.Map;

import com.ferreapp.adapter.ui.EpsUi;
import com.ferreapp.domain.entities.Eps;

// public class Main {
//     public static void main(String[] args) {
//         EpsUi epsUI = new EpsUi();
//         Map<Integer, Eps> myEps = epsUI.FindAllEps();
//         for (Eps eps : epsUI.FindAllEpsList("coomeva", myEps)) {
//             System.out.println("id: " + eps.getId() + "Nombre: " + eps.getName());
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
        EpsUi epsUI = new EpsUi();
        Map<Integer, Eps> myEps = epsUI.FindAllEps();
        for (Eps eps : epsUI.FindAllEpsList("coomeva", myEps)) {
            System.out.println("id: " + eps.getId() + "Nombre: " + eps.getName());
        }
    }
}