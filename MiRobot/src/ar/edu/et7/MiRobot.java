package ar.edu.et7;

import robocode.Robot;


//TODO Renombrar este archivo y el nombre de la clase, 
//el nombre debe incluir el apellido del alumno

public class MiRobot extends Robot {
	
	public void run() {
		
		while(true) {
			
			//TODO modificar este bloque de código y recargar 
			//en Robocode presionando Restart
            ahead(300);

            turnGunRight(860);

            back(800);

            turnGunRight(560);		}
	}
}
