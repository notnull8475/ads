package ru.gb.homeworks.hm2;

import java.util.Comparator;

public class NotebookComparator implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        int eprice = Double.compare(o1.getPrice(), o2.getPrice());
        int eram = Integer.compare(o2.getRam(), o1.getRam());
        int ebrand = (o1.getBrand().compareTo(o2.getBrand()));
        if (ebrand == 0 && eprice == 0 && eram == 0) return 0;
        if (eprice != 0) return eprice;
        if (eram != 0) return eram;
        return ebrand;
    }
}
