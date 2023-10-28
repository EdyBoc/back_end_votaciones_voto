/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.miumg.votaciones.dto;

import lombok.Data;
import javax.validation.constraints.Null;

/**
 *
 * @author Oscar
 */
@Data
public class ParametrosBusquedaVotacionDto {

    @Null
    Integer partido;

    @Null
    Integer departamento;

    @Null
    Integer municipio;

}
