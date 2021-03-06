package obstacles;

import theParticipants.Participants;

import java.util.stream.Stream;

public class AllObstacles implements Obstacles {

    public Object[] allObstacles() {
        Wall[] walls = new Wall[5];
        for (int i = 0; i < walls.length; i++) {
            walls[i] = new Wall((i + 1) * 11, (i + 1) * 0.4);
        }
        Treadmill[] treadmills = new Treadmill[5];
        for (int j = 0; j < treadmills.length; j++) {
            treadmills[j] = new Treadmill((j + 1) * 10, (j + 1) * 300);
        }
        //System.out.println(Arrays.toString(allObstacles));
        return Stream.of(walls,treadmills)
                .flatMap(Stream::of)
                .toArray();
    }

    @Override
    public boolean passed(Participants participant) {
        return false;
    }
}
