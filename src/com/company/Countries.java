
package com.company;

import java.util.*;
import java.lang.*;

class Countries {

    ArrayList<Countriesv2> list = new ArrayList<>();

    Countries() {
        Countriesv2 kaz = new Countriesv2();
        kaz.setCountry("Казахстан");
        kaz.setCity("Нурсултан");
        kaz.setDescription("В этой стране расположен каньон помимо США");
        list.add(kaz);

        Countriesv2 rus = new Countriesv2();
        rus.setCountry("Россия");
        rus.setCity("Москва");
        rus.setDescription("Это страна занимает 1-е место по территории");
        list.add(rus);

        Countriesv2 kyr = new Countriesv2();
        kyr.setCountry("Кыргызстан");
        kyr.setCity("Бишкек");
        kyr.setDescription("В этой стране находится озеро Иссык-Куль");
        list.add(kyr);

        Countriesv2 usa = new Countriesv2();
        usa.setCountry("Сша");
        usa.setCity("Вашнигтон");
        usa.setDescription("Валюта этой страны очень популярна");
        list.add(usa);

        Countriesv2 kor = new Countriesv2();
        kor.setCountry("Южная Корея");
        kor.setCity("Сеул");
        kor.setDescription("В этой стране родился Абай ага =)");
        list.add(kor);

        Countriesv2 nkor = new Countriesv2();
        nkor.setCountry("КНДР");
        nkor.setCity("Пхеньян");
        nkor.setDescription("Эта закрытая страна в которую просто так не попадешь!");
        list.add(nkor);

        Countriesv2 china = new Countriesv2();
        china.setCountry("Китай");
        china.setCity("Пекин");
        china.setDescription("У них очень большое население,потому что презервативы их качества");
        list.add(china);

        Countriesv2 tur = new Countriesv2();
        tur.setCountry("Турция");
        tur.setCity("Анкара");
        tur.setDescription("Донер и шаурма оттуда вообщем");
        list.add(tur);

        Countriesv2 ang = new Countriesv2();
        ang.setCountry("Англия");
        ang.setCity("Лондон");
        ang.setDescription("у этой страны было много колоний");
        list.add(ang);

        Countriesv2 ind = new Countriesv2();
        ind.setCountry("Индия");
        ind.setCity("Дели");
        ind.setDescription("33% изнасиловании во всем мире происходит в столице этой страны");
        list.add(ind);

        Countriesv2 braz = new Countriesv2();
        braz.setCountry("Бразилия");
        braz.setCity("РиоДеЖанейро");
        braz.setDescription("Примечание:СТолица пишется слитно. В этой стране стоит большой памятник Иисуса Христа");
        list.add(braz);

        Countriesv2 uzb = new Countriesv2();
        uzb.setCountry("Узбекистан");
        uzb.setCity("Ташкент");
        uzb.setDescription("В этой стране много гастарбайтеров");
        list.add(uzb);

        Countriesv2 aus = new Countriesv2();
        aus.setCountry("Австралия");
        aus.setCity("Канберра");
        aus.setDescription("В этой стране обитают Кенгуру Коалы");
        list.add(aus);

        Countriesv2 mon = new Countriesv2();
        mon.setCountry("Монголия");
        mon.setCity("Улан-Батор");
        mon.setDescription("Родина Чингисхана");
        list.add(mon);

        Countriesv2 jap = new Countriesv2();
        jap.setCountry("Япония");
        jap.setCity("Токио");
        jap.setDescription("95% населения смотрят аниме");
        list.add(jap);

        Countriesv2 azer = new Countriesv2();
        azer.setCountry("Азербайджан");
        azer.setCity("Душанбе");
        azer.setDescription("туда ездили Алмат с Айжан служить");
        list.add(azer);

        Countriesv2 ukr = new Countriesv2();
        ukr.setCountry("Украина");
        ukr.setCity("Киев");
        ukr.setDescription("у этой страны стычка с Россией была");
        list.add(ukr);

        Countriesv2 kan = new Countriesv2();
        kan.setCountry("Канада");
        kan.setCity("Оттава");
        kan.setDescription("эта страна постоянно соревнуется с Россией по хоккею");
        list.add(kan);

        Countriesv2 viet = new Countriesv2();
        viet.setCountry("Вьетнам");
        viet.setCity("Ханой");
        viet.setDescription("помимо Китая они тоже производят вещи,и как то Америка до них докопалась");
        list.add(viet);

        Countriesv2 laos = new Countriesv2();
        laos.setCountry("Лаос");
        laos.setCity("Вьентьян");
        laos.setDescription("Страна миллионов слонов и белого зонта");
        list.add(laos);
    }
}

class Countriesv2 {

    private String country; // Страна
    private String city;    // Столится
    private String description; // Твои чудо коментарии

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        String n = "Cтрана";
        return n + ":" + " " + getCountry() + "\n" + "Описание: " + getDescription();
    }
}
