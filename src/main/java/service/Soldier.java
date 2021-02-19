package service;

import annotations.ServiceMan;

/**
 *
 * @author NisfaYasam
 */
@ServiceMan(value = ServiceMan.ServiceType.SOLDIER)
public class Soldier implements Salute {

    @Override
    public String greetings(String name) {
        return new StringBuilder("Welcome ")
                .append(name)
                .append("! Good Morning, \\nHave a Good Day major!").toString();
    }

}
