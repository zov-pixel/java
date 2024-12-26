
import java.util.*;
import java.util.stream.Collectors;

public class SpaceStation{

    CrewMember crewMember;

    int numbWorkExperience = 0;
    int numbHealthLevel = 0;
    int numbResourceLevel = 0;
    private List<CrewMember> crewMemberList = new ArrayList<>();

    public Collection<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(Collection<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    private Collection<CrewMember> crewMembers = new ArrayList<>();

    public List<CrewMember> getCrewMemberList() {
        return crewMemberList;
    }

    public SpaceStation() {

    }

    public void setCrewMemberList(List<CrewMember> crewMemberList) {
        this.crewMemberList = crewMemberList;
    }


    public void assignCrewMember(CrewMember crewMember) {
        this.crewMember = crewMember;
        crewMember.setSpaceStation(this);
        crewMemberList.add(crewMember);
    }

    public void assignMultipleCrewMembers(Collection<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
        for (CrewMember i : crewMembers) {
            i.setSpaceStation(this);
            crewMemberList.add(i);
        }

    }

    public void removeCrewMember(CrewMember crewMember) {
        this.crewMember = crewMember;
        crewMember.setSpaceStation(this);
        crewMemberList.remove(crewMember);
    }

    public void retiredCrewMembers(Collection<CrewMember> crewMembers, int count) {
        int numb=0;
        this.crewMembers = crewMembers;
        for (CrewMember i : crewMembers) {
            if (numb < count) {
                i.setSpaceStation(this);
                crewMemberList.remove(i);
                numb=numb+1;
            }
        }
    }

    public List<CrewMember> workExperience() {
        HashMap<Integer, Integer> missions = new HashMap<>();
        HashMap<Integer, CrewMember> text = new HashMap<>();
        ArrayList<CrewMember> workExperienceList = new ArrayList<>();
        for (CrewMember i : crewMemberList) {
            missions.put(numbWorkExperience, Integer.parseInt(i.toString().split("/")[2]));
            text.put(numbWorkExperience, i);
            numbWorkExperience = numbWorkExperience + 1;

        }
        Map<Integer, Integer> result = missions.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        for (Integer i : result.keySet()) {
            workExperienceList.add(text.get(i));
        }

        return workExperienceList;

    }

    public List<CrewMember> healthLevel() {
        HashMap<Integer, Integer> healths = new HashMap<>();
        HashMap<Integer, CrewMember> text = new HashMap<>();
        ArrayList<CrewMember> healthLevelList = new ArrayList<>();
        for (CrewMember i : crewMemberList) {
            healths.put(numbHealthLevel, Integer.parseInt(i.toString().split("/")[3]));
            text.put(numbHealthLevel, i);
            numbHealthLevel = numbHealthLevel + 1;

        }
        Map<Integer, Integer> result = healths.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        for (Integer i : result.keySet()) {
            healthLevelList.add(text.get(i));
        }
        return healthLevelList;

    }

    public List<CrewMember> getMostExperiencedCrew(int count) {
        return workExperience().subList(0, count);
    }

    public List<CrewMember> getLeastHealthyCrew(int count) {
        return healthLevel().subList(0, count);
    }

    public void print(List<CrewMember> list) {
        for (CrewMember i : list) {
            if (i.toString().split("/").length == 4) {
                System.out.println("Имя: " + i.toString().split("/")[0] + ", Специальность: " + i.toString().split("/")[1] + ", Опыт: " + i.toString().split("/")[2] + ", Здоровье " + i.toString().split("/")[3]);
            } else {
                System.out.println("Имя: " + i.toString().split("/")[0] + ", Специальность: " + i.toString().split("/")[1] + "Уровень ресурсов: " + Integer.parseInt(i.toString().split("/")[2]));
            }
        }
        System.out.println("\n");
    }

    public void getResourcesLevel() {
        HashMap<Integer, Integer> resources = new HashMap<>();
        HashMap<Integer, String> text = new HashMap<>();
        ArrayList<CrewMember> workExperienceList = new ArrayList<>();
        for (CrewMember i : crewMemberList) {
            resources.put(numbResourceLevel, (Integer.parseInt(i.toString().split("/")[2]) * Integer.parseInt(i.toString().split("/")[3])) / 100);
            text.put(numbResourceLevel, i.toString());
            numbResourceLevel = numbResourceLevel + 1;

        }
        Map<Integer, Integer> result = resources.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        for (Integer i : result.keySet()) {
            System.out.println("Имя: " + text.get(i).split("/")[0] + ", Специальность: " + text.get(i).split("/")[1] + ", Уровень ресурсов: "+ resources.get(i));
        }

    }
}