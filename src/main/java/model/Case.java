package model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import Enum.ETypeTerain;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Case {

    private Coordonees coordonees;

    private ETypeTerain typeTerain;



}
