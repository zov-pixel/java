
public class Researcher implements CrewMember{
    private SpaceStation spaceStation;

    private String member;


    @Override
    public void setSpaceStation(SpaceStation spaceStation) {
        this.spaceStation = spaceStation;
    }

    public Researcher(String engineer) {
        this.member = engineer;

    }

    @Override
    public String toString() {
        return member;
    }

}
