package model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import Enum.EDirection;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coordonees {

    private Integer x;

    private Integer y;


    public void directionVers(EDirection d) {
        switch (d) {
            case Nord:
                x++;
                break;
            case SUD:
                x--;
                break;
            case EST:
                y++;
                break;
            case OUEST:
                y--;
                break;
            default:
        }
    }

}
