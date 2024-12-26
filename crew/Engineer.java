


public class Engineer implements CrewMember {

    private SpaceStation spaceStation;

    private String member;



    @Override
    public void setSpaceStation(SpaceStation spaceStation) {
        this.spaceStation = spaceStation;
    }

    public Engineer(String engineer) {
        this.member = engineer;

    }

    @Override
    public String toString() {
        return member;
    }



}
