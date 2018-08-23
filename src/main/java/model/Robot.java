package model;
import Enum.ETypeRobot;
import Enum.EDirection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Robot {

    private ETypeRobot type;

    private Coordonees position;

    private Terain terain;

    public void deplacement(EDirection direction) {

        Coordonees positionSuivante = position;
        positionSuivante.directionVers(direction);
        Case caseSuivante = terain.getCases().get(positionSuivante);

        switch (caseSuivante.getTypeTerain()) {
            // test Posibilité de deplacement +  control incendie ...
        }

    }

}
