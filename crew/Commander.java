
public class Commander implements CrewMember{
    private SpaceStation spaceStation;

    private String member;



    @Override
    public void setSpaceStation(SpaceStation spaceStation) {
        this.spaceStation = spaceStation;
    }

    public Commander(String member) {
        this.member= member;

    }

    @Override
    public String toString() {
        return member;
    }
}
