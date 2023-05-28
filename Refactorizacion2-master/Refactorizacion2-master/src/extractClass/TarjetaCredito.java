package extractClass;

import java.util.Date;

public class TarjetaCredito {
	private String numeroTarjeta;
	private Date fechaCaducidad;
	private int numeroControl;

	public boolean estaCaducada() {
		return fechaCaducidad.before(new Date());
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroControl() {
		return numeroControl;
	}

	public void setNumeroControl(int numeroControl) {
		this.numeroControl = numeroControl;
	}

}
