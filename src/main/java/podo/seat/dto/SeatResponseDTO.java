package podo.seat.dto;

import podo.seat.constace.SeatStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SeatResponseDTO {

    private Long id;
    private Character row;
    private Integer column;
    private SeatStatus status;

}
