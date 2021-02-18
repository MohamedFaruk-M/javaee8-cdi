package beans;

import annotations.ServiceMan;
import annotations.Web;
import javax.inject.Inject;
import service.Salute;
import model.User;

/**
 *
 * @author NisfaYasam
 */
@Web
public class QualifierWithValueBean {

    @Inject
    @ServiceMan(value = ServiceMan.ServiceType.POLICE)
    private Salute police;

    @Inject
    @ServiceMan(value = ServiceMan.ServiceType.SOLDIER)
    private Salute soldier;

    @Inject
    private User userPolice;

    @Inject
    private User userSoldier;

    public void greetPolice() {
        userPolice.setSalutation(police.greetings(userPolice.getName()));
    }

    public void greetSoldier() {
        userSoldier.setSalutation(soldier.greetings(userSoldier.getName()));
    }

    public String getPoliceSalutation() {
        return userPolice.getSalutation();
    }

    public String getSoldierSalutation() {
        return userSoldier.getSalutation();
    }

}
