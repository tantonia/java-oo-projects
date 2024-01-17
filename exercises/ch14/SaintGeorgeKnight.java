package gr.aueb.cf.exercises.ch14;

public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight(){

    }

    public static SaintGeorgeKnight getInstance() {
        return INSTANCE;
    }

    public void embarkOnMission() {
        System.out.println("Saint George embarks on mission!");
    }
}
