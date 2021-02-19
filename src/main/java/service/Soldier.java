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
                .append("! Have a Good Day major!").toString();
    }

}
