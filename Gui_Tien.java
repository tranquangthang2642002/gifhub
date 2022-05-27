
public class Gui_Tien extends Giao_Dich{
private int so_Luong_Gui;


public Gui_Tien(int ma_So, int ngay_Giao_Dich, Chuyen_Tien chuyen_tien, Rut_Tien rut_tien, Gui_Tien gui_tien,
		int so_Luong_Gui) {
	super(ma_So, ngay_Giao_Dich, chuyen_tien, rut_tien, gui_tien);
	this.so_Luong_Gui = so_Luong_Gui;
}

public int getSo_Luong_Gui() {
	return so_Luong_Gui;
}

public void setSo_Luong_Gui(int so_Luong_Gui) {
	this.so_Luong_Gui = so_Luong_Gui;
}


}
