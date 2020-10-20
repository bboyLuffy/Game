
package com.company;
import java.util.*;
import java.lang.* ;

class Countries {

    Map<String, String> world = new HashMap<>();
    ArrayList<String>list = new ArrayList<>();
    Map<String,String>description = new HashMap<>();
    String a = "Казахстан";
    String b = "Кыргызстан";
    String c = "США";
    String d = "Россия";
    String e = "Южная Корея";
    String f = "КНДР";
    String g = "Китай";
    String k = "Турция";
    String l = "Англия";
    String m = "Индия";
    String o = "Бразилия";
    String p = "Узбекистан";
    String i = "Австралия";
    String q = "Монголия";
    String r = "Япония";
    String s = "Азербайджан";
    String t = "Украина";
    String u = "Канада";
    String v = "Вьетнам";
    String w = "Лаос";
Countries(){

    world.put(a,"Нурсултан");
    list.add(a);
  description.put(a,"В этой стране расположен каньон помимо США");

    world.put(b,"Бишкек");
    list.add(b);
description.put(b,"В этой стране находится озеро Иссык-Куль");

    world.put(c,"Вашингтон");
    list.add(c);
description.put(c,"Валюта этой страны очень популярна");

    world.put(d,"Москва");
    list.add(d);
description.put(d,"Это страна занимает 1-е место по территории");

    world.put(e,"Сеул");
    list.add(e);
description.put(e,"В этой стране родился Абай ага =)");

    world.put(f,"Пхеньян");
    list.add(f);
description.put(f,"Эта закрытая страна в которую просто так не попадешь");

    world.put(g,"Пекин");
    list.add(g);
description.put(g,"У них очень большое население,потому что презервативы их качества");

    world.put(k,"Анкара");
    list.add(k);
description.put(k,"Донер и шаурма оттуда вообщем");

    world.put(l,"Лондон");
    list.add(l);
description.put(l,"у этой страны было много колоний");

    world.put(m,"Дели");
    list.add(m);
description.put(m,"33% изнасиловании во всем мире происходит в столице этой страны");

    world.put(o,"РиоДеЖанейро");
    list.add(o);
   description.put(o,"Примечание:СТолица пишется слитно. В этой стране стоит большой памятник Иисуса Христа");

    world.put(p,"Ташкент");
    list.add(p);
  description.put(p,"В этой стране много гастарбайтеров");

    world.put(i,"Канберра");
    list.add(i);
  description.put(i,"В этой стране обитают Кенгуру Коалы");

    world.put(q,"Улан-Батор");
    list.add(q);
   description.put(q,"Родина Чингисхана");

    world.put(r,"Токио");
    list.add(r);
   description.put(r,"95% населения смотрят аниме");

    world.put(s,"Баку");
    list.add(s);
   description.put(s,"туда ездили Алмат с Айжан служить");

    world.put(t,"Киев");
    list.add(t);
   description.put(t,"у этой страны стычка с Россией была");

    world.put(u,"Оттава");
    list.add(u);
   description.put(u,"эта страна постоянно соревнуется с Россией по хоккею");

    world.put(v,"Ханой");
    list.add(v);
description.put(v,"помимо Китая они тоже производят вещи,и как то Америка до них докопалась");

    world.put(w,"Вьентьян");
    list.add(w);
   description.put(w,"Страна миллионов слонов и белого зонта");
    
}

    public void remove(String key) {
    list.remove(key);
    }
}