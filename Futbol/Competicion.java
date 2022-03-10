
public class Competicion {
	private Equipo[] equipos = new Equipo[10];
	Emparejamiento[] resultado;

	public Competicion() {
		//se crea para poder hacerlo con 4 equipos en vez de con 10
		super();
		equipos = new Equipo[4];
		emparejamientos = emparejamientoEquipos(equipos);
		
	}
	public Competicion() {
		super();
		equipos = new Equipo[10];
		emparejamientos = emparejamientoEquipos(equipos);

	}

	private Emparejamiento[] emparejamientoEquipos(Equipo[] misEquipos) {
		int [] guiaEmparejamiento= new int [misEquipos.length];
		return null;
	}
}
