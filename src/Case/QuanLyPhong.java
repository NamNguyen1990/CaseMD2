package Case;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPhong {

    static List<Phong> phongList = new ArrayList<>();

    public static List<Phong> getPhongList() {
        return phongList;
    }

    public static void setPhongList(List<Phong> phongList) {
        QuanLyPhong.phongList = phongList;
    }

    static {

    }

    public void them (Phong phong) {
        phongList.add(phong);
        System.out.println(ANSI_BLUE + "Bạn đã thêm thành công 1 phòng mới" + ANSI_RESET);
    }

    public void hienThi() {
        boolean check = false;
        for (int i=0; i<phongList.size(); i++) {
            System.out.println(phongList.get(i));
            check = true;
        }
        if (check == false) {
            System.out.println(ANSI_RED + "Chưa có phòng nào được thêm mới!" + ANSI_RESET);
        }
    }











    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
}
