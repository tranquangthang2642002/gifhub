
public class Rut_Tien extends Giao_Dich{
private int so_Luong_Rut;


public Rut_Tien(int ma_So, int ngay_Giao_Dich, Chuyen_Tien chuyen_tien, Rut_Tien rut_tien, Gui_Tien gui_tien,
		int so_Luong_Rut) {
	super(ma_So, ngay_Giao_Dich, chuyen_tien, rut_tien, gui_tien);
	this.so_Luong_Rut = so_Luong_Rut;
}

public int getSo_Luong_Rut() {
	return so_Luong_Rut;
}

public void setSo_Luong_Rut(int so_Luong_Rut) {
	this.so_Luong_Rut = so_Luong_Rut;
}


}
